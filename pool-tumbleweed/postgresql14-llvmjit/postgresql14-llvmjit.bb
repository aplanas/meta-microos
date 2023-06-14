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

RPM_NAME = "postgresql14-llvmjit-14.8-1.2.aarch64.rpm"
RPM_HASH = "44a30d6635442835ef1d3f1a10ed488359b6950e41d1cda317bcc20d146cbf1840cc424586f020ac6913b05c30408a5a42f15d6f3ad1f68218ef972585a04cdb"

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
