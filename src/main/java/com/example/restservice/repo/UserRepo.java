package com.example.restservice.repo;

import com.example.restservice.model.Role;
import com.example.restservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);

    List<User> findAllByRole(Role user);
}
