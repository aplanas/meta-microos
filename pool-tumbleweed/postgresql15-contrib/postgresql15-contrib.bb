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

PV = "15.4"

RPM_NAME = "postgresql15-contrib-15.4-1.1.aarch64.rpm"
RPM_HASH = "741ecd2b26d678b245a31c83a065cae5c72f2921e1173d4f62837e472b3219d568f5d209b6ad084855973abfa89ac072c4c2132b03171e43b68fd9a95c0c84c4"

RPROVIDES:${PN} += "postgresql-contrib-implementation \
postgresql15-contrib"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libm.so.6 \
libperl.so \
libpq.so.5 \
libpython3.11.so.1.0 \
libselinux.so.1 \
libuuid.so.1 \
libxml2.so.2 \
libxslt.so.1 \
libz.so.1 \
postgresql-contrib-noarch \
postgresql15 \
postgresql15-server"

inherit rpm
