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

PV = "11.20"

RPM_NAME = "postgresql11-contrib-11.20-1.2.aarch64.rpm"
RPM_HASH = "eca5a19a1beec6b62431a18fd2c283cc015f34215f9aee953b08ba164b8a79912a1100a69d05f4c6b833ffa1ec96ef77c108e4e20c367ee8e4715f17f994d28a"

RPROVIDES:${PN} += "postgresql-contrib-implementation \
postgresql11-contrib"

RDEPENDS:${PN} += "/usr/bin/sh \
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
postgresql11 \
postgresql11-server"

inherit rpm
