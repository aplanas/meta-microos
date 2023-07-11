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

PV = "15.3"

RPM_NAME = "postgresql15-llvmjit-15.3-1.5.aarch64.rpm"
RPM_HASH = "c64504149901cc6285a704ee9bc9ac9bfc76529a6ef3d9cdfda2726ccb0dbc05ea60419a7cd3787841541b858766e0a1eb8588cc64eabc3b92ccf4a2b51dec4c"

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
