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

RPM_NAME = "postgresql15-llvmjit-15.3-1.2.aarch64.rpm"
RPM_HASH = "a9d76a7d19166b3d5aa4c4e9bc4795d2771053f428cd134c0e0f233b785bff6e01ceae2b2e324103d1a8bae20d181a0ceac47fd0065d8d0baad3ce3c2292519c"

RPROVIDES:${PN} += "postgresql-llvmjit-implementation \
postgresql15-llvmjit \
postgresql15-llvmjit(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libLLVM.so.15()(64bit) \
libLLVM.so.15(LLVM_15)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit) \
postgresql-llvmjit-noarch \
postgresql15-server"

inherit rpm
