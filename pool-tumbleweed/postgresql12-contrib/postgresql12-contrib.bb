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

PV = "12.16"

RPM_NAME = "postgresql12-contrib-12.16-1.1.aarch64.rpm"
RPM_HASH = "c840b6a15a0f670be2460de8774929b3933285f615fed19a75eb03c14a1219d7eaf6a604c14dcb73727e108f9c5ade17744d11cd58fdd6c4985c31fe489363ad"

RPROVIDES:${PN} += "postgresql-contrib-implementation \
postgresql12-contrib"

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
postgresql12 \
postgresql12-server"

inherit rpm
