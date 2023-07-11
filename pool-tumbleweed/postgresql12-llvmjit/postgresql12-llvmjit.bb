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

RPM_NAME = "postgresql12-llvmjit-12.15-1.5.aarch64.rpm"
RPM_HASH = "b5d7013c3e0645898d382be4e79ae0b58d9bf38ff46c50adffe1895fe96388cacc017494326b06d2fbd06b84701e89b66d1e5e39446aa620b6d775b0cc8a8b68"

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
