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

PV = "13.12"

RPM_NAME = "postgresql13-contrib-13.12-1.1.aarch64.rpm"
RPM_HASH = "215f09a4c3e7b4771aec3ff8c673a043d31d06ca00df7126c602f9ba3afcb11c0cb70684842e01ddce461e72b7ac874a4fbb33b9d74f1c182fef87ba09071e03"

RPROVIDES:${PN} += "postgresql-contrib-implementation \
postgresql13-contrib"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libm.so.6 \
libperl.so \
libpq.so.5 \
libpython3.11.so.1.0 \
libselinux.so.1 \
libssl.so.3 \
libuuid.so.1 \
libxml2.so.2 \
libxslt.so.1 \
libz.so.1 \
postgresql-contrib-noarch \
postgresql13 \
postgresql13-server"

inherit rpm
