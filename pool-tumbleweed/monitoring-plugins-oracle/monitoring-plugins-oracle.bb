SUMMARY = "Check Oracle status"
DESCRIPTION = "Check Oracle database health status."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-oracle-2.3.1-9.4.aarch64.rpm"
RPM_HASH = "27db7e0debc2399e92542764d84e333d5768ff1e43e6edd289720147222a40490f9ff09c409e70b2ee6d7a5564cce2c2bd81f6e95a9e978425bb725c9c729dca"

RPROVIDES:${PN} += "monitoring-plugins-oracle \
nagios-plugins-oracle"

RDEPENDS:${PN} += "/usr/bin/sh \
monitoring-plugins-common"

inherit rpm
