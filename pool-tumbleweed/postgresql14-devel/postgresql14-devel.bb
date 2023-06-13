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
postgresql14-server-devel package."
LICENSE = "PostgreSQL"

PV = "14.8"

RPM_NAME = "postgresql14-devel-14.8-1.2.aarch64.rpm"
RPM_HASH = "67136647ce58b28aafa0318c01f71531a7037d5843cccc043c4a0b885ee6740553a1c78ccce24ccf324d296b0b67933c77adc0b813c5466521a7bf51f32da360"

RPROVIDES:${PN} += "pkgconfig(libecpg) \
pkgconfig(libecpg_compat) \
pkgconfig(libpgtypes) \
pkgconfig(libpq) \
postgresql-devel \
postgresql-devel-exclusive \
postgresql-devel-implementation \
postgresql14-devel \
postgresql14-devel(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/pkg-config \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libecpg6 \
libpq5 \
pkgconfig(libcrypto) \
pkgconfig(libecpg) \
pkgconfig(libpgtypes) \
pkgconfig(libpq) \
pkgconfig(libssl) \
postgresql-devel-noarch"

inherit rpm
