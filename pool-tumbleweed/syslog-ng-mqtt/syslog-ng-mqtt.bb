SUMMARY = "MQTT support for syslog-ng"
DESCRIPTION = "This package provides MQTT support for syslog-ng"
LICENSE = "GPL-2.0-only"

PV = "4.3.1"

RPM_NAME = "syslog-ng-mqtt-4.3.1-1.2.aarch64.rpm"
RPM_HASH = "7e79b95c43877433c8884a05c66dc1dbf3500d4184856f212c020f1310f3767d2e3ce9e34ad37089f76184fc09e3216ebfb09514e333b55bc68e9982bee08d39"

RPROVIDES:${PN} += "syslog-ng-mqtt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libevtlog-4.3.so.0 \
libglib-2.0.so.0 \
libpaho-mqtt3cs.so.1 \
libsyslog-ng-4.3.so.0 \
syslog-ng"

inherit rpm
