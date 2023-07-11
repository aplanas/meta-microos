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

RPM_NAME = "postgresql13-llvmjit-13.11-1.5.aarch64.rpm"
RPM_HASH = "a7c113a1097ea1ef922ecce495b7b458c4129877838ecdd7f2999e35f43552feec32a22c8560f4256c537acc97670b819e7a5963cc090db49a741775d161f14f"

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
