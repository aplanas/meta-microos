SUMMARY = "SQL auxprop plugin for cyrus-sasl"
DESCRIPTION = "The SQL auxprop plugin supports PostgreSQL and MySQL"
LICENSE = "BSD-4-Clause"

PV = "2.1.28"

RPM_NAME = "cyrus-sasl-sqlauxprop-bdb-2.1.28-5.1.aarch64.rpm"
RPM_HASH = "9294269c473c9daa77abc152fde4adf3e2efcc5b9dc990a5b376d95e64dd39a0902cca725754525e773ff21f276b0c40dcae438420c772fbe02be7ab6c3fa7c9"

RPROVIDES:${PN} += "cyrus-sasl-sqlauxprop-bdb \
libsql.so.3"

RDEPENDS:${PN} += "cyrus-sasl-bdb \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmariadb.so.3 \
libpq.so.5"

inherit rpm
