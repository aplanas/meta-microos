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

RPM_NAME = "postgresql15-contrib-15.3-1.2.aarch64.rpm"
RPM_HASH = "e7b03a25e47fe1493ec3441af75408d2768dd305c9f5763665bd1d1f468e525680bc91ca76dd3398bc92af73b8fed97fa8f137753ff12d289fdb43b4ee880e0d"

RPROVIDES:${PN} += "postgresql-contrib-implementation \
postgresql15-contrib"

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
postgresql15 \
postgresql15-server"

inherit rpm
