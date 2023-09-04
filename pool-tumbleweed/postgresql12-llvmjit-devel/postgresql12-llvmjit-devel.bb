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

PV = "12.16"

RPM_NAME = "postgresql12-llvmjit-devel-12.16-1.1.aarch64.rpm"
RPM_HASH = "3a7a80229afe90022664fa0b0a09ea250dc26db00fa1807fd0c5569a04f4f2fa62d97c129d64fd1dd36e3990894a005bfc2655c47bc8bab920f29c6ec7f29c90"

RPROVIDES:${PN} += "postgresql-llvmjit-devel \
postgresql-llvmjit-devel-implementation \
postgresql12-llvmjit-devel"

RDEPENDS:${PN} += "clang15 \
llvm15 \
postgresql-llvmjit-devel-noarch \
postgresql12-llvmjit \
postgresql12-server-devel"

inherit rpm
