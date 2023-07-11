SUMMARY = "Just-in-time compilation support for PostgreSQL"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, sub-queries, triggers, and user-defined \
types and functions. \
 \
This package contains support for just-in-time compiling parts of \
PostgreSQL queries. Using LLVM it compiles e.g. expressions and tuple \
deforming into native code, with the goal of accelerating analytics \
queries."
LICENSE = "PostgreSQL"

PV = "11.20"

RPM_NAME = "postgresql11-llvmjit-11.20-1.5.aarch64.rpm"
RPM_HASH = "9cd83ea70ad98c6c08d0638cd656214867ed48ef3ea0b878eab2d96955bf09d0644765262584be07c0d5231c32d6ccbcd17adb4a027389e110e00b3771fabfb7"

RPROVIDES:${PN} += "postgresql-llvmjit-implementation \
postgresql11-llvmjit"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libLLVM.so.15 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
postgresql-llvmjit-noarch \
postgresql11-server"

inherit rpm
