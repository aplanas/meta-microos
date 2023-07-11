SUMMARY = "PostgreSQL driver for libdbi"
DESCRIPTION = "This driver provides connectivity to PostgreSQL database servers \
through the libdbi database independent abstraction layer. Switching \
a program's driver does not require recompilation or rewriting source \
code."
LICENSE = "LGPL-2.1+"

PV = "0.9.0.g53"

RPM_NAME = "libdbi-drivers-dbd-pgsql-0.9.0.g53-3.19.aarch64.rpm"
RPM_HASH = "59674e0f66cb174496692086942743ff787e8915ab1e27cbae8cf193b4eb121d060296360bec21a426603fa1b350eca916f6be8cb19b09c7a712876b6af9718b"

RPROVIDES:${PN} += "libdbdpgsql.so \
libdbi-drivers-dbd-pgsql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdbi.so.3 \
libpq.so.5"

inherit rpm
