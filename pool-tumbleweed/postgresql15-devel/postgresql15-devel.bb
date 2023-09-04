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
postgresql15-server-devel package."
LICENSE = "PostgreSQL"

PV = "15.4"

RPM_NAME = "postgresql15-devel-15.4-1.1.aarch64.rpm"
RPM_HASH = "4d3b5b63b21f37618abb227d571c82fbc0fa720ea7d87095aecb036464dd3cf29538d7be8fffa5325bb06811da6306004836a68c1ebbce342944d90f83e9fead"

RPROVIDES:${PN} += "pkgconfig-libecpg \
pkgconfig-libecpg-compat \
pkgconfig-libpgtypes \
pkgconfig-libpq \
postgresql-devel \
postgresql-devel-exclusive \
postgresql-devel-implementation \
postgresql15-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libecpg6 \
libpq5 \
pkgconfig-libcrypto \
pkgconfig-libecpg \
pkgconfig-libpgtypes \
pkgconfig-libpq \
pkgconfig-libssl \
postgresql-devel-noarch"

inherit rpm
