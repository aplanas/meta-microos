SUMMARY = "PostgreSQL development header files and libraries"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, subqueries, triggers, and user-defined \
types and functions. \
 \
This package contains the header files and libraries needed to compile \
C applications which will directly interact with a PostgreSQL database \
management server and the ECPG Embedded C Postgres preprocessor. You \
need to install this package if you want to develop applications in C \
which will interact with a PostgreSQL server."
LICENSE = "PostgreSQL"

PV = "15"

RPM_NAME = "postgresql-devel-15-2.12.noarch.rpm"
RPM_HASH = "7903e53617eb4396715718391efc5457d8feff89e45843a9bcba6c2a9f3d2c79e4f91b22c837877736389005ad5e5da1412a5f16c2fb022db887131c38b797e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pkgconfig-libecpg \
pkgconfig-libecpg-compat \
pkgconfig-libpgtypes \
pkgconfig-libpq \
postgresql-devel \
postgresql-devel-noarch"

RDEPENDS:${PN} += "postgresql-devel-implementation"

inherit rpm
