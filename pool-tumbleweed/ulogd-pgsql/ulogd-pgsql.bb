SUMMARY = "PostgreSQL output target for ulogd"
DESCRIPTION = "PostgreSQL output target for ulogd."
LICENSE = "GPL-2.0-only"

PV = "2.0.7"

RPM_NAME = "ulogd-pgsql-2.0.7-6.8.aarch64.rpm"
RPM_HASH = "182465f141c2e89bd1f9700451d3255e98413cd58a41db38aa6f10cb127cc53786013cbdae1038639c48b4a293892c7b6f87169c6f007e03b578a739dbfeab26"

RPROVIDES:${PN} += "ulogd-pgsql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpq.so.5 \
ulogd"

inherit rpm
