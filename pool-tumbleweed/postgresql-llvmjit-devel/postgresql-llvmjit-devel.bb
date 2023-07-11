SUMMARY = "Helper package to pull all dependencies to build with llvm support"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, sub-queries, triggers, and user-defined \
types and functions. \
 \
This package will pull all the dependencies to build extensions with llvm \
support if the base distro has llvm enabled. \
 \
Otherwise it will just pull the postgresqlXY-server-devel package"
LICENSE = "PostgreSQL"

PV = "15"

RPM_NAME = "postgresql-llvmjit-devel-15-2.10.noarch.rpm"
RPM_HASH = "eb505fa393e71f973a27b3c6b55a846e92117a18ea68c187baf13f5a39d1bfe9796d7b587fb0e590a21e8995c82c44f926ecb5a3506f98dc64dc9850117f74d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgresql-llvmjit-devel \
postgresql-llvmjit-devel-noarch"

RDEPENDS:${PN} += "postgresql-llvmjit-devel-implementation \
postgresql-server-devel-noarch"

inherit rpm
