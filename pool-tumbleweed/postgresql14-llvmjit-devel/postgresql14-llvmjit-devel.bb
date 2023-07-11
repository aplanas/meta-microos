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

RPM_NAME = "postgresql14-llvmjit-devel-14.8-1.5.aarch64.rpm"
RPM_HASH = "69344f594bec51c5f5d0100992c7c80155ab9502e62dabf4d2936b91f983b34284a9c7fba0dd05000f4ab14b234763cabb83a56a1f2238bb34ba69f3a4ccce04"

RPROVIDES:${PN} += "postgresql-llvmjit-devel \
postgresql-llvmjit-devel-implementation \
postgresql14-llvmjit-devel"

RDEPENDS:${PN} += "clang15 \
llvm15 \
postgresql-llvmjit-devel-noarch \
postgresql14-llvmjit \
postgresql14-server-devel"

inherit rpm
