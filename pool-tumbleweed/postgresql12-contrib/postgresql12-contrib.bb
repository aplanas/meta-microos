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

PV = "12.15"

RPM_NAME = "postgresql12-contrib-12.15-1.2.aarch64.rpm"
RPM_HASH = "b43ccd2132e97d553c69af5477bb0f9739c2cd3e3a5b103414a509de75cdde08a597f448de1d54c8b74074964119eff45fa13a2c9b4783745daecfb2293e376d"

RPROVIDES:${PN} += "postgresql-contrib-implementation \
postgresql12-contrib"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libm.so.6 \
libperl.so \
libpq.so.5 \
libpython3.10.so.1.0 \
libselinux.so.1 \
libssl.so.3 \
libuuid.so.1 \
libxml2.so.2 \
libxslt.so.1 \
libz.so.1 \
postgresql-contrib-noarch \
postgresql12 \
postgresql12-server"

inherit rpm
