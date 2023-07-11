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

PV = "15.3"

RPM_NAME = "postgresql15-contrib-15.3-1.5.aarch64.rpm"
RPM_HASH = "4b4f38aa82ab9e19dfa618a4fd4939bc6771fd510724568cb73752d6b11f83bcfe9913ef60010f06c12b3e85eea7cf9f9b2c15e2f692e4ec46960c2fbbc6d84c"

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
