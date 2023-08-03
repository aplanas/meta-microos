SUMMARY = "MQTT support for syslog-ng"
DESCRIPTION = "This package provides MQTT support for syslog-ng"
LICENSE = "GPL-2.0-only"

PV = "4.3.1"

RPM_NAME = "syslog-ng-mqtt-4.3.1-1.1.aarch64.rpm"
RPM_HASH = "9d131d30e001db3eedf84072f299265990c57bb4aa5c6aefa0b694e1b16cb133e8dcaf7774b582de35dc26a7df9bd8bee127f2848ccb6b503f00a8818e0e7974"

RPROVIDES:${PN} += "syslog-ng-mqtt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libevtlog-4.3.so.0 \
libglib-2.0.so.0 \
libpaho-mqtt3cs.so.1 \
libsyslog-ng-4.3.so.0 \
syslog-ng"

inherit rpm
