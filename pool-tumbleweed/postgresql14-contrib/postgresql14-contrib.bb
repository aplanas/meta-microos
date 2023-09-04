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

RPM_NAME = "postgresql14-contrib-14.8-1.6.aarch64.rpm"
RPM_HASH = "a31da636be7b702942998eb1df78f5ba7d529726469bf944652df3af228fa81860c27e29004664bdad4394f912ae12819b05ed6018c8059af5a858c5bdb97162"

RPROVIDES:${PN} += "postgresql-contrib-implementation \
postgresql14-contrib"

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
postgresql14 \
postgresql14-server"

inherit rpm
