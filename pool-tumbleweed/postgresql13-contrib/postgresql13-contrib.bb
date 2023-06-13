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

PV = "13.11"

RPM_NAME = "postgresql13-contrib-13.11-1.2.aarch64.rpm"
RPM_HASH = "eda0226ce89bb7e8550c65698965b38fe9c591072e7e1362b5aa456ab312f672722b4e2a4ade31eac42dd22679aa24164f9e069b755384aac8a051054a3484da"

RPROVIDES:${PN} += "postgresql-contrib-implementation \
postgresql13-contrib \
postgresql13-contrib(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libm.so.6()(64bit) \
libperl.so()(64bit) \
libpq.so.5()(64bit) \
libpython3.10.so.1.0()(64bit) \
libselinux.so.1()(64bit) \
libssl.so.3()(64bit) \
libuuid.so.1()(64bit) \
libxml2.so.2()(64bit) \
libxslt.so.1()(64bit) \
libz.so.1()(64bit) \
postgresql-contrib-noarch \
postgresql13 \
postgresql13-server"

inherit rpm
