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

PV = "12.15"

RPM_NAME = "postgresql12-devel-12.15-1.2.aarch64.rpm"
RPM_HASH = "555e1079ab728afd021eb3baabfc94496c320219989dcc8c275e810a2392c547f446840b1c9b2f64f3b43bb868079d9a97a175d22da9c48604832586e249fcbd"

RPROVIDES:${PN} += "pkgconfig(libecpg) \
pkgconfig(libecpg_compat) \
pkgconfig(libpgtypes) \
pkgconfig(libpq) \
postgresql-devel \
postgresql-devel-exclusive \
postgresql-devel-implementation \
postgresql12-devel \
postgresql12-devel(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/pkg-config \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libecpg6 \
libpq5 \
pkgconfig(libecpg) \
pkgconfig(libpgtypes) \
pkgconfig(libpq) \
postgresql-devel-noarch"

inherit rpm
