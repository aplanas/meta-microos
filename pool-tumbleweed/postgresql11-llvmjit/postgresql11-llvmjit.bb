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

RPM_NAME = "postgresql11-llvmjit-11.20-1.2.aarch64.rpm"
RPM_HASH = "b0377ca80bde4ffb79cdf70202c74af35172c50215a96f32abdba928ba83d449ce64b095faa733615f6f6966bfd3d888c355d38cbef9662432e44b7d7d027724"

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
