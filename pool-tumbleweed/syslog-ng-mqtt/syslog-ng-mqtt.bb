SUMMARY = "MQTT support for syslog-ng"
DESCRIPTION = "This package provides MQTT support for syslog-ng"
LICENSE = "GPL-2.0-only"

PV = "4.2.0"

RPM_NAME = "syslog-ng-mqtt-4.2.0-2.2.aarch64.rpm"
RPM_HASH = "bb0c91fbc60bd1259fe90b2202589c80756a8141f9cdad79facab8047e2d0f52f7872b5b1e4624685aa9d61748fe2b4b1b501509dd67d81524d4c8099764a1bb"

RPROVIDES:${PN} += "syslog-ng-mqtt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libevtlog-4.2.so.0 \
libglib-2.0.so.0 \
libpaho-mqtt3cs.so.1 \
libsyslog-ng-4.2.so.0 \
syslog-ng"

inherit rpm
