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

PV = "13.11"

RPM_NAME = "postgresql13-devel-13.11-1.2.aarch64.rpm"
RPM_HASH = "a0a29064aa6bc46486aca7ffe8656dbe107f7035b119a12cb70802cbe612dcdcb5254c645d067f95269d0f67a60d64ea5563b1080f2fb2313ef57c9ee5fae519"

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
