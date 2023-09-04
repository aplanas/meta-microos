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

PV = "15.4"

RPM_NAME = "postgresql15-llvmjit-15.4-1.1.aarch64.rpm"
RPM_HASH = "12102026a5b97b5bf59978e6f7510e088d9a33c45137b92768fec8d5e80bcdb0ba75a49eae351502314894df3d6a6584df1aa6f4902d03d9e0a5d9de496570b6"

RPROVIDES:${PN} += "postgresql-llvmjit-implementation \
postgresql15-llvmjit"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libLLVM.so.15 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
postgresql-llvmjit-noarch \
postgresql15-server"

inherit rpm
