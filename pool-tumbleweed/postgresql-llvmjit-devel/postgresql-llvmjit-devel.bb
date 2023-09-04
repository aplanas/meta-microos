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

RPM_NAME = "postgresql-llvmjit-devel-15-2.12.noarch.rpm"
RPM_HASH = "46497f18a09689595e667c5c264cb1c54f8ab524a64ccbe6b5d1acf1f812de3f01de61e4b2a78bd18033f0931c22920aab71cab755a40c6e173d74fdb1f13d2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgresql-llvmjit-devel \
postgresql-llvmjit-devel-noarch"

RDEPENDS:${PN} += "postgresql-llvmjit-devel-implementation \
postgresql-server-devel-noarch"

inherit rpm
