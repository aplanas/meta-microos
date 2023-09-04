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

PV = "11.21"

RPM_NAME = "postgresql11-contrib-11.21-1.1.aarch64.rpm"
RPM_HASH = "0d324216c8b1cc0d170c7f5f0fec7d1f1aa815503af53be4a2d341ccde8fd517b4cb5d42c5b12733a91f3749e644b657a821d7c8ed79720577c116df83e9e12c"

RPROVIDES:${PN} += "postgresql-contrib-implementation \
postgresql11-contrib"

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
postgresql11 \
postgresql11-server"

inherit rpm
