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

PV = "14.8"

RPM_NAME = "postgresql14-llvmjit-14.8-1.5.aarch64.rpm"
RPM_HASH = "98926a30756b2034eb12f36e05d8dcb5e6b3c7a299e052e7c51a11b0653b38826651f8067987a0ab2cd2fcfb65228488b95c253ad4ce21932db25ab6edc45998"

RPROVIDES:${PN} += "postgresql-llvmjit-implementation \
postgresql14-llvmjit"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libLLVM.so.15 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
postgresql-llvmjit-noarch \
postgresql14-server"

inherit rpm
