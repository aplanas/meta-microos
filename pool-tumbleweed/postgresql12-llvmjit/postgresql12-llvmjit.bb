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

PV = "12.16"

RPM_NAME = "postgresql12-llvmjit-12.16-1.1.aarch64.rpm"
RPM_HASH = "e0b69beeeb2407c5cbb89dae13fbeb9ae28fb3f109441bd27de0903775f11a3b543d680afdf274c33d468f31c4528dc99aed8187a70dc4e57feb91ac64cefba8"

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
