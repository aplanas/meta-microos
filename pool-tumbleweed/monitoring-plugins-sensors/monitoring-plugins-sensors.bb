SUMMARY = "Check hardware status using lm_sensors"
DESCRIPTION = "This plugin checks hardware status using the lm_sensors package."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-sensors-2.3.1-9.5.aarch64.rpm"
RPM_HASH = "44abc6a72f930c921f6f7e0ea4c06a9a69d44ae886aa28bfe76fa1059958fc63a52dc68aef473d1b7f6081a7f17201ee500df33f51ed8c7090342f88e380e272"

RPROVIDES:${PN} += "monitoring-plugins-sensors \
nagios-plugins-sensors"

RDEPENDS:${PN} += "/usr/bin/sh \
grep \
monitoring-plugins-common \
sensors"

inherit rpm
