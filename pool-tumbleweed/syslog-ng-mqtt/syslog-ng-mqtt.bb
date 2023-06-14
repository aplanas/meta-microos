SUMMARY = "MQTT support for syslog-ng"
DESCRIPTION = "This package provides MQTT support for syslog-ng"
LICENSE = "GPL-2.0-only"

PV = "4.2.0"

RPM_NAME = "syslog-ng-mqtt-4.2.0-1.1.aarch64.rpm"
RPM_HASH = "70c471a0be91e008c7514e5d899b7944c0f6a8ccbbd8686ca5df449f9aa623b90aefd39200d8047330baa25e75b8a8187bd7056aba796ec60349d47b63fce285"

RPROVIDES:${PN} += "syslog-ng-mqtt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libevtlog-4.2.so.0 \
libglib-2.0.so.0 \
libpaho-mqtt3cs.so.1 \
libsyslog-ng-4.2.so.0 \
syslog-ng"

inherit rpm
