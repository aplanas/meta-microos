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

PV = "13.12"

RPM_NAME = "postgresql13-llvmjit-13.12-1.1.aarch64.rpm"
RPM_HASH = "6f50576f00b98385f0a5e018f9f7d2a20143bcd6455e2b3f0f46243a7038ccc840125366abaea6d00c118ac52161bbdeaf3f3eeab4f5a70df2191e3d8b4962bd"

RPROVIDES:${PN} += "postgresql-llvmjit-implementation \
postgresql13-llvmjit"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libLLVM.so.15 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
postgresql-llvmjit-noarch \
postgresql13-server"

inherit rpm
