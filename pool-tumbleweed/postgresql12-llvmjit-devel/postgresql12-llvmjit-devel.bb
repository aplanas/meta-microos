SUMMARY = "PostgreSQL development files for extensions with LLVM support"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, sub-queries, triggers, and user-defined \
types and functions. \
 \
This package pulls in the right versions of llvm and clang to compile \
PostgreSQL extensions that support just-in-time compilation with LLVM, \
if llvm is supported. Otherwise it will just pull the \
postgresql12-server-devel package."
LICENSE = "PostgreSQL"

PV = "12.15"

RPM_NAME = "postgresql12-llvmjit-devel-12.15-1.5.aarch64.rpm"
RPM_HASH = "e4e6b6b50878fa65d0cd0cfe8ed456de6f964a45deecfdc815ebd35bbba99f07b39e37b3f93366004d97bcfb97ca4de7646a868a3be9455684f57cc4871fe5ce"

RPROVIDES:${PN} += "postgresql-llvmjit-devel \
postgresql-llvmjit-devel-implementation \
postgresql12-llvmjit-devel"

RDEPENDS:${PN} += "clang15 \
llvm15 \
postgresql-llvmjit-devel-noarch \
postgresql12-llvmjit \
postgresql12-server-devel"

inherit rpm
