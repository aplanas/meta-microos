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

PV = "15.3"

RPM_NAME = "postgresql15-devel-15.3-1.2.aarch64.rpm"
RPM_HASH = "a974c8734128975249d77c397799c383ecd1dae7c33d81c57ab563cdff9594bf4c590d7ddf9355b1fde76396c3d3db8d2b93a8814886751c1a12296702c5f8d4"

RPROVIDES:${PN} += "pkgconfig(libecpg) \
pkgconfig(libecpg_compat) \
pkgconfig(libpgtypes) \
pkgconfig(libpq) \
postgresql-devel \
postgresql-devel-exclusive \
postgresql-devel-implementation \
postgresql15-devel \
postgresql15-devel(aarch-64)"

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
