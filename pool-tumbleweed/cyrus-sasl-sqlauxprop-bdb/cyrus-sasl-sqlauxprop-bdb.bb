SUMMARY = "SQL auxprop plugin for cyrus-sasl"
DESCRIPTION = "The SQL auxprop plugin supports PostgreSQL and MySQL"
LICENSE = "BSD-4-Clause"

PV = "2.1.28"

RPM_NAME = "cyrus-sasl-sqlauxprop-bdb-2.1.28-5.2.aarch64.rpm"
RPM_HASH = "4c5fd630cc80e938ae1d20acacc7ebc640a598d02f5504267d55123fddfa0c1199614caf9721f917fa490e2eae5b25216069c0d1ee8e51a6060fa0d8bb6daf51"

RPROVIDES:${PN} += "cyrus-sasl-sqlauxprop-bdb \
libsql.so.3"

RDEPENDS:${PN} += "cyrus-sasl-bdb \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmariadb.so.3 \
libpq.so.5"

inherit rpm
