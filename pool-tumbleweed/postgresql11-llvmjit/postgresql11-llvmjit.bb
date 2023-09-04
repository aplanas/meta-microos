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

PV = "11.21"

RPM_NAME = "postgresql11-llvmjit-11.21-1.1.aarch64.rpm"
RPM_HASH = "c11105fdf2cca2311fcd72faefad459547d750c0955dbd2c2c6b513bf33d6371bbc01de87f848bdaaf1447170e41d9e1c2be14b2e8885d15b5570282d66bb2ad"

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
