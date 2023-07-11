SUMMARY = "PostgreSQL development files for extensions with LLVM support"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, sub-queries, triggers, and user-defined \
types and functions. \
 \
This package pulls in the right versions of llvm and clang to compile \
PostgreSQL extensions that support just-in-time compilation with LLVM, \
if llvm is supported. Otherwise it will just pull the \
postgresql13-server-devel package."
LICENSE = "PostgreSQL"

PV = "13.11"

RPM_NAME = "postgresql13-llvmjit-devel-13.11-1.5.aarch64.rpm"
RPM_HASH = "77317d5f7d06cb479a12f5c554b593e57f8b144799c4d751135a66317a3fd295f3119573d1f27bfbe69602f2c92188248feac7174d4b91cef32f7015eb754275"

RPROVIDES:${PN} += "postgresql-llvmjit-devel \
postgresql-llvmjit-devel-implementation \
postgresql13-llvmjit-devel"

RDEPENDS:${PN} += "clang15 \
llvm15 \
postgresql-llvmjit-devel-noarch \
postgresql13-llvmjit \
postgresql13-server-devel"

inherit rpm
