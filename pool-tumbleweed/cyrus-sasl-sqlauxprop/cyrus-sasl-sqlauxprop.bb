SUMMARY = "SQL auxprop plugin for cyrus-sasl"
DESCRIPTION = "The SQL auxprop plugin supports PostgreSQL and MySQL"
LICENSE = "BSD-4-Clause"

PV = "2.1.28"

RPM_NAME = "cyrus-sasl-sqlauxprop-2.1.28-5.2.aarch64.rpm"
RPM_HASH = "40fb85f50ddaba61cc164dee4a57e1a021facae0f405642bca41eb0148f37b1c68648494670dea33421f23b45f77d13bdd3477bd55e652ff7ba1345617ced0be"

RPROVIDES:${PN} += "cyrus-sasl-sqlauxprop \
libsql.so.3"

RDEPENDS:${PN} += "cyrus-sasl \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmariadb.so.3 \
libpq.so.5"

inherit rpm
