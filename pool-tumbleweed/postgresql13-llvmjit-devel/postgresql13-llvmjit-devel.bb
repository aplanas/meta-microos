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

PV = "13.12"

RPM_NAME = "postgresql13-llvmjit-devel-13.12-1.1.aarch64.rpm"
RPM_HASH = "51aeaa6094768afbff8ba7645bdebd4b9814ffb9eb59409d40c1e2f2f96fd198072a01d7fe51a31bf82077ad2f7ddd270101b2cd25bd7816039bc2d94f3c0526"

RPROVIDES:${PN} += "postgresql-llvmjit-devel \
postgresql-llvmjit-devel-implementation \
postgresql13-llvmjit-devel"

RDEPENDS:${PN} += "clang15 \
llvm15 \
postgresql-llvmjit-devel-noarch \
postgresql13-llvmjit \
postgresql13-server-devel"

inherit rpm
