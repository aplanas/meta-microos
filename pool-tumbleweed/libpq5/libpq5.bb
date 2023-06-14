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

RPM_NAME = "libpq5-15.3-1.2.aarch64.rpm"
RPM_HASH = "4a7091a68b9815db71cf85c6f819a5a7e064971fd904ba80ffa4de84d4463fb2730027b21036c43b0f224fcf0beefd9bf703c58f84ab042914d6a4c918f03058"

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
