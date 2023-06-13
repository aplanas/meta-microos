SUMMARY = "Check hardware status using lm_sensors"
DESCRIPTION = "This plugin checks hardware status using the lm_sensors package."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-sensors-2.3.1-9.4.aarch64.rpm"
RPM_HASH = "9e69c61852abe01f683ec708bf9764e625da7966f164768b2ad537375d554691ea93e3d25b2846d99cdb13da876883aa665ee785bedfeb8c52c87cf5f7db1011"

RPROVIDES:${PN} += "monitoring-plugins-sensors \
monitoring-plugins-sensors(aarch-64) \
nagios-plugins-sensors"

RDEPENDS:${PN} += "/bin/sh \
grep \
monitoring-plugins-common \
sensors"

inherit rpm
