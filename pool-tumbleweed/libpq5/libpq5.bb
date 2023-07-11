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

PV = "15.3"

RPM_NAME = "libpq5-15.3-1.5.aarch64.rpm"
RPM_HASH = "f93d0626c57e058c74df6ff680640f7a27c1e6e851c54b7e2aacdf3bcfa428d9e25b26e072265be5e45730ce74b47e66921b0c94391692c7be8367ce13b7c8ee"

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
