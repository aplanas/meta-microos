SUMMARY = "PostgreSQL client development header files and libraries"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, subqueries, triggers, and user-defined \
types and functions. \
 \
This package contains the header files and libraries needed to compile \
C applications which will directly interact with a PostgreSQL database \
management server and the ECPG Embedded C Postgres preprocessor. You \
need to install this package if you want to develop applications in C \
which will interact with a PostgreSQL server. \
 \
For building PostgreSQL server extensions, see the \
postgresql11-server-devel package."
LICENSE = "PostgreSQL"

PV = "11.21"

RPM_NAME = "postgresql11-devel-11.21-1.1.aarch64.rpm"
RPM_HASH = "23af872e83be16e1276c78d67841614b8c62c7cf90000e31c5f2ac3c6638e27f82dc2f7d1a9fa73ea1104f20683951ec56d89affe70900218cd03c893d5b79d8"

RPROVIDES:${PN} += "pkgconfig-libecpg \
pkgconfig-libecpg-compat \
pkgconfig-libpgtypes \
pkgconfig-libpq \
postgresql-devel \
postgresql-devel-exclusive \
postgresql-devel-implementation \
postgresql11-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libecpg6 \
libpq5 \
pkgconfig-libecpg \
pkgconfig-libpgtypes \
pkgconfig-libpq \
postgresql-devel-noarch"

inherit rpm
