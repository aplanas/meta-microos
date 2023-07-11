SUMMARY = "PostgreSQL Module for ProFTPD"
DESCRIPTION = "This is the PostgreSQL Module for ProFTPD"
LICENSE = "GPL-2.0-or-later"

PV = "1.3.7f"

RPM_NAME = "proftpd-pgsql-1.3.7f-1.4.aarch64.rpm"
RPM_HASH = "99ec739f48f6283982d715cc8514a5608bf760b09de18dbd25bde9a2e512ba6664b743b8a05adba1bb8d4d4e7251dfdbc0b600f499a99c03cfca3be67825da9b"

RPROVIDES:${PN} += "proftpd-pgsql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpq.so.5 \
proftpd"

inherit rpm
