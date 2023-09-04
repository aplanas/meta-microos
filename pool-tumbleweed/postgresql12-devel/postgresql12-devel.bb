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
postgresql12-server-devel package."
LICENSE = "PostgreSQL"

PV = "12.16"

RPM_NAME = "postgresql12-devel-12.16-1.1.aarch64.rpm"
RPM_HASH = "2498b5950ad84bb60b6b706c37aad5061fbb99bd6828421054da42544218728a9ef8e16b75ced9ef89a847d8cdaa932717e16a470e8dff69b8734ad30da9f4ed"

RPROVIDES:${PN} += "pkgconfig-libecpg \
pkgconfig-libecpg-compat \
pkgconfig-libpgtypes \
pkgconfig-libpq \
postgresql-devel \
postgresql-devel-exclusive \
postgresql-devel-implementation \
postgresql12-devel"

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
