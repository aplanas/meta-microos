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

RPM_NAME = "postgresql14-contrib-14.8-1.5.aarch64.rpm"
RPM_HASH = "7c8716b0d5799822a5a962a9871d3925b2c10720d3c62288d9e9dd727d95143b19667e1e7b236b1a2a85f103d9697d985bbeb054dc2032ffcadd57bcbe75d7b4"

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
