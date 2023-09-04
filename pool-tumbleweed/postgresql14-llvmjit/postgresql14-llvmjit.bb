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

RPM_NAME = "postgresql14-llvmjit-14.8-1.6.aarch64.rpm"
RPM_HASH = "7b5942916278f1e6f12d777864d340f7ee6b1d59be8ee718ed6076ee87027339113eb68182e769ee209776b4abebdcf648734cd7fc8e44c849a2e491f70327f6"

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
