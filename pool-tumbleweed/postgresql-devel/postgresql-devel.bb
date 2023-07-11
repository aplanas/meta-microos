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

RPM_NAME = "postgresql-devel-15-2.10.noarch.rpm"
RPM_HASH = "fba9f4167ef6113b28e9f3121fa450a7800152d05c41f90082440e7b7254ea381ace0c8ea2e37ceff301e2f59ca9add4ded3b348ee1328ef2e32d765ef0f4715"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pkgconfig-libecpg \
pkgconfig-libecpg-compat \
pkgconfig-libpgtypes \
pkgconfig-libpq \
postgresql-devel \
postgresql-devel-noarch"

RDEPENDS:${PN} += "postgresql-devel-implementation"

inherit rpm
