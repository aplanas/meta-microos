SUMMARY = "PostgreSQL development files for extensions with LLVM support"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, sub-queries, triggers, and user-defined \
types and functions. \
 \
This package pulls in the right versions of llvm and clang to compile \
PostgreSQL extensions that support just-in-time compilation with LLVM, \
if llvm is supported. Otherwise it will just pull the \
postgresql15-server-devel package."
LICENSE = "PostgreSQL"

PV = "15.4"

RPM_NAME = "postgresql15-llvmjit-devel-15.4-1.1.aarch64.rpm"
RPM_HASH = "3cf57872fe4a9a3cd3cd53b7cbfdf83d3bd95dbfabf06358e49a941f07ce5def21d2682b75e0406489d4bf0197c4f8d4aea9ae58f936ee7c8635083f1394b87f"

RPROVIDES:${PN} += "postgresql-llvmjit-devel \
postgresql-llvmjit-devel-implementation \
postgresql15-llvmjit-devel"

RDEPENDS:${PN} += "clang15 \
llvm15 \
postgresql-llvmjit-devel-noarch \
postgresql15-llvmjit \
postgresql15-server-devel"

inherit rpm
