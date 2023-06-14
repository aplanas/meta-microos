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

PV = "12.15"

RPM_NAME = "postgresql12-llvmjit-12.15-1.2.aarch64.rpm"
RPM_HASH = "13f17f2af1ce6d82176bc2f65827da876f177e0a1ae0537d9252660148ea8e5c4fcf08c7f2e393c4fecbc23691d947a6f6c73391fa5d9030f90008f8c53783af"

RPROVIDES:${PN} += "postgresql-llvmjit-implementation \
postgresql12-llvmjit"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libLLVM.so.15 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
postgresql-llvmjit-noarch \
postgresql12-server"

inherit rpm
