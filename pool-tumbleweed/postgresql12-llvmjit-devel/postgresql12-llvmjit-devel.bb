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

RPM_NAME = "postgresql12-llvmjit-devel-12.15-1.2.aarch64.rpm"
RPM_HASH = "e88f09416b2426fa219c86821ccd887948f5935aa523c3de0c8df71313be17037a13d9b05bd8d92b18b1367ea72f214b26972f2808208fc34bb435784396ae70"

RPROVIDES:${PN} += "postgresql-llvmjit-devel \
postgresql-llvmjit-devel-implementation \
postgresql12-llvmjit-devel"

RDEPENDS:${PN} += "clang15 \
llvm15 \
postgresql-llvmjit-devel-noarch \
postgresql12-llvmjit \
postgresql12-server-devel"

inherit rpm
