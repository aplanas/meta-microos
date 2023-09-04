SUMMARY = "Shared Libraries Required for PostgreSQL Clients"
DESCRIPTION = " \
PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, subqueries, triggers, user-defined types \
and functions. \
 \
This package provides the client library that most PostgreSQL client \
program or language bindings are using."
LICENSE = "PostgreSQL"

PV = "15.4"

RPM_NAME = "libpq5-15.4-1.1.aarch64.rpm"
RPM_HASH = "df5ca85c2b217d29b0635281c7da126d09128454bc2a95f9e36c15961b281294b5a0f4d3bde3c4148ee35eae78863f05aeddd22365556984699e559d8a691fdb"

RPROVIDES:${PN} += "libpq.so.5 \
libpq5 \
postgresql-libs-/usr/lib64/libpq.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgssapi-krb5.so.2 \
libldap.so.2 \
libssl.so.3"

inherit rpm
