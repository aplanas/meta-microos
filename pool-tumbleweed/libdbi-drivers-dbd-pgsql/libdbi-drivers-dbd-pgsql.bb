SUMMARY = "PostgreSQL driver for libdbi"
DESCRIPTION = "This driver provides connectivity to PostgreSQL database servers \
through the libdbi database independent abstraction layer. Switching \
a program's driver does not require recompilation or rewriting source \
code."
LICENSE = "LGPL-2.1+"

PV = "0.9.0.g53"

RPM_NAME = "libdbi-drivers-dbd-pgsql-0.9.0.g53-3.18.aarch64.rpm"
RPM_HASH = "4128a780187879af042aec6f45c4e2f2748b85c1db6cf2c1f5218c8123bcb03b2ee2ed4b254aa6e73ac3871440153b412f2021ecfb2145e6af189c91a92eccfe"

RPROVIDES:${PN} += "libdbdpgsql.so \
libdbi-drivers-dbd-pgsql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdbi.so.3 \
libpq.so.5"

inherit rpm
