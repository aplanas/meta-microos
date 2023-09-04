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

PV = "11.21"

RPM_NAME = "postgresql11-llvmjit-devel-11.21-1.1.aarch64.rpm"
RPM_HASH = "da38320962257310376951d71053657ffc4d34bae8d69489d9999cbefb44e81c519373d79a56c5f74fd56f9dc83076a89bf938ddf4c04618c524bc3cb34e9388"

RPROVIDES:${PN} += "postgresql-llvmjit-devel \
postgresql-llvmjit-devel-implementation \
postgresql11-llvmjit-devel"

RDEPENDS:${PN} += "clang15 \
llvm15 \
postgresql-llvmjit-devel-noarch \
postgresql11-llvmjit \
postgresql11-server-devel"

inherit rpm
