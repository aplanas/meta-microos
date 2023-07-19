SUMMARY = "MQTT support for syslog-ng"
DESCRIPTION = "This package provides MQTT support for syslog-ng"
LICENSE = "GPL-2.0-only"

PV = "4.2.0"

RPM_NAME = "syslog-ng-mqtt-4.2.0-3.1.aarch64.rpm"
RPM_HASH = "41784f52ad907486e11e2002fa6519df31cc3c9a11513e1971f8c9187f9ef69e17859d75267c6936823f2123477beedac52a041b213b3dce80a16d914584051f"

RPROVIDES:${PN} += "syslog-ng-mqtt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libevtlog-4.2.so.0 \
libglib-2.0.so.0 \
libpaho-mqtt3cs.so.1 \
libsyslog-ng-4.2.so.0 \
syslog-ng"

inherit rpm
