SUMMARY = "SQL auxprop plugin for cyrus-sasl"
DESCRIPTION = "The SQL auxprop plugin supports PostgreSQL and MySQL"
LICENSE = "BSD-4-Clause"

PV = "2.1.28"

RPM_NAME = "cyrus-sasl-sqlauxprop-2.1.28-5.1.aarch64.rpm"
RPM_HASH = "7183c756980ace6dd167c3653fc50dfd2585e671131c60d0a0b3d1b191e274e480afe6686f3174c4b8fd4b31d6c72b3d59edb5db422979c97f544972a4dd614a"

RPROVIDES:${PN} += "cyrus-sasl-sqlauxprop \
libsql.so.3"

RDEPENDS:${PN} += "cyrus-sasl \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmariadb.so.3 \
libpq.so.5"

inherit rpm
