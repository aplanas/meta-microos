SUMMARY = "Check databases using DBI"
DESCRIPTION = "This program connects to an (SQL) database using DBI and checks the \
specified metric against threshold levels. The default metric is \
the result of the specified query. \
 \
This package provides the check_dbi plugin."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-dbi-2.3.1-9.5.aarch64.rpm"
RPM_HASH = "ab8b38e984163fc8ea9690441d590285f010f19b6c193d647853fe88ec5f03eb60f036d2314c571e536807e9eedef30f4991f4822402d8d21aeee28e4fdd7aef"

RPROVIDES:${PN} += "monitoring-plugins-dbi \
nagios-plugins-dbi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdbi.so.3 \
monitoring-plugins-dbi-backend"

inherit rpm
