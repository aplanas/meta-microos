SUMMARY = "Postfix plugin to support PostgreSQL maps"
DESCRIPTION = "Postfix plugin to support PostgreSQL maps. This library will be loaded \
by starting postfix if you'll access a postmap which is stored in \
PostgreSQL."
LICENSE = "IPL-1.0 | EPL-2.0"

PV = "3.8.0"

RPM_NAME = "postfix-postgresql-3.8.0-2.2.aarch64.rpm"
RPM_HASH = "c7877f2e9f71c3128c581737bc134a58e5879aad7efb71a30633be56f15d4f5f73afa08f222ba46be530aa1247953995cb5880dd5fde61b1df1fbe9b56660149"

RPROVIDES:${PN} += "postfix-postgresql"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpq.so.5 \
postfix"

inherit rpm
