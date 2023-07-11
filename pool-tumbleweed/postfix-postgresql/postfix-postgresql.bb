SUMMARY = "Postfix plugin to support PostgreSQL maps"
DESCRIPTION = "Postfix plugin to support PostgreSQL maps. This library will be loaded \
by starting postfix if you'll access a postmap which is stored in \
PostgreSQL."
LICENSE = "IPL-1.0 | EPL-2.0"

PV = "3.8.1"

RPM_NAME = "postfix-postgresql-3.8.1-1.1.aarch64.rpm"
RPM_HASH = "247ec9b949d10d4e221fdb471b3ffcd41809fd1281064e4871cde674e32b873056e9d74dce5441a88b90e10d81966fa6e39779016e36ed2d4a920fda32b5df63"

RPROVIDES:${PN} += "postfix-postgresql"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpq.so.5 \
postfix"

inherit rpm
