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

PV = "13.11"

RPM_NAME = "postgresql13-llvmjit-13.11-1.2.aarch64.rpm"
RPM_HASH = "d3051fc07fad5269ad4a1640bc4efb2f9848f1298d4ec909c47de66fbbb0f8ac675a9be21a41160b793ccde66b781102660c494e59a9e3fc20ef1e4a6087ae32"

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
