SUMMARY = "PostgreSQL development files for extensions with LLVM support"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, sub-queries, triggers, and user-defined \
types and functions. \
 \
This package pulls in the right versions of llvm and clang to compile \
PostgreSQL extensions that support just-in-time compilation with LLVM, \
if llvm is supported. Otherwise it will just pull the \
postgresql14-server-devel package."
LICENSE = "PostgreSQL"

PV = "14.8"

RPM_NAME = "postgresql14-llvmjit-devel-14.8-1.6.aarch64.rpm"
RPM_HASH = "a984c7e5c1992bc65df0b3766866ac237b66566760ba123914bd6680a2ddb9d6a55afcfac434576d4aacecb2c6765eb3f8cacaa5d3183833a5ecc175d06f5e69"

RPROVIDES:${PN} += "postgresql-llvmjit-devel \
postgresql-llvmjit-devel-implementation \
postgresql14-llvmjit-devel"

RDEPENDS:${PN} += "clang15 \
llvm15 \
postgresql-llvmjit-devel-noarch \
postgresql14-llvmjit \
postgresql14-server-devel"

inherit rpm
