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
postgresql13-server-devel package."
LICENSE = "PostgreSQL"

PV = "13.12"

RPM_NAME = "postgresql13-devel-13.12-1.1.aarch64.rpm"
RPM_HASH = "00934f7cf97c4ec7e5aa68edfecba2b747ce3a2c9486775ad9f78ea5595042fca90ea3afa0050ed5e6479cb499e2f4da6a70ea064b6a614df578c7fcd8dcec5c"

RPROVIDES:${PN} += "pkgconfig-libecpg \
pkgconfig-libecpg-compat \
pkgconfig-libpgtypes \
pkgconfig-libpq \
postgresql-devel \
postgresql-devel-exclusive \
postgresql-devel-implementation \
postgresql13-devel"

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
