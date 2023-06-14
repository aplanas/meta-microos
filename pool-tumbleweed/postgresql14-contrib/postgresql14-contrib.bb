SUMMARY = "Contributed Extensions and Additions to PostgreSQL"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, subqueries, triggers, and user-defined \
types and functions. \
 \
The postgresql-contrib package includes extensions and additions that \
are distributed along with the PostgreSQL sources, but are not (yet) \
officially part of the PostgreSQL core. \
 \
Documentation for the modules contained in this package can be found in \
/usr/share/doc/packages/postgresql/contrib."
LICENSE = "PostgreSQL"

PV = "14.8"

RPM_NAME = "postgresql14-contrib-14.8-1.2.aarch64.rpm"
RPM_HASH = "523b2aff4c8bd6a8e6acd0c8103cf1850e87b29ef82e68f70be03e29c76d81e721f81d80904d962c26ebe5c474c0b2d29c5cd1956e38cf7f44d7557cf9119c36"

RPROVIDES:${PN} += "postgresql-contrib-implementation \
postgresql14-contrib"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libm.so.6 \
libperl.so \
libpq.so.5 \
libpython3.10.so.1.0 \
libselinux.so.1 \
libuuid.so.1 \
libxml2.so.2 \
libxslt.so.1 \
libz.so.1 \
postgresql-contrib-noarch \
postgresql14 \
postgresql14-server"

inherit rpm
