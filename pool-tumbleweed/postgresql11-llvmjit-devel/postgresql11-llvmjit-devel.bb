SUMMARY = "PostgreSQL development files for extensions with LLVM support"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, sub-queries, triggers, and user-defined \
types and functions. \
 \
This package pulls in the right versions of llvm and clang to compile \
PostgreSQL extensions that support just-in-time compilation with LLVM, \
if llvm is supported. Otherwise it will just pull the \
postgresql11-server-devel package."
LICENSE = "PostgreSQL"

PV = "11.20"

RPM_NAME = "postgresql11-llvmjit-devel-11.20-1.5.aarch64.rpm"
RPM_HASH = "3f7dd79ebf15c6864e3472f50d0d84b51253f64ec527e505abca06fbacfb32681c54cb8f3d93d9ac8c1344c362fef56cf98d3507a18f03d05af705ae922e3c7e"

RPROVIDES:${PN} += "postgresql-llvmjit-devel \
postgresql-llvmjit-devel-implementation \
postgresql11-llvmjit-devel"

RDEPENDS:${PN} += "clang15 \
llvm15 \
postgresql-llvmjit-devel-noarch \
postgresql11-llvmjit \
postgresql11-server-devel"

inherit rpm
