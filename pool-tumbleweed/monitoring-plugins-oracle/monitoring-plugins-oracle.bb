SUMMARY = "Check Oracle status"
DESCRIPTION = "Check Oracle database health status."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-oracle-2.3.1-9.5.aarch64.rpm"
RPM_HASH = "9c9cde0e76628f8fc7e24f48c71b88d3c623f333b5f3a43fe7853d3ce866c4ce19d352c2b677b53a882eff6cc112ed77734e110f09b393a543954001fb9bc54f"

RPROVIDES:${PN} += "monitoring-plugins-oracle \
nagios-plugins-oracle"

RDEPENDS:${PN} += "/usr/bin/sh \
monitoring-plugins-common"

inherit rpm
