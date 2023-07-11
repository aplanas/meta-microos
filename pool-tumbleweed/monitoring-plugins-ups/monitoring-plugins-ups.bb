SUMMARY = "Test UPS service on the specified host"
DESCRIPTION = "This plugin tests the UPS service on the specified host. \
 \
Network UPS Tools from www.networkupstools.org must be running for this plugin \
to work."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-ups-2.3.1-9.5.aarch64.rpm"
RPM_HASH = "8cb5c06b2338bd53c26c74b304cd46ee5fdfb97d4c2aa468bf68f08c748d35fd5177a21c79907bbb6aad18344acd490af53beb4b0daee5388e4b65b4d54b112c"

RPROVIDES:${PN} += "config-monitoring-plugins-ups \
monitoring-plugins-ups \
nagios-plugins-ups"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
