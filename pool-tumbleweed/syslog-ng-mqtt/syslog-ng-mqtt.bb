SUMMARY = "MQTT support for syslog-ng"
DESCRIPTION = "This package provides MQTT support for syslog-ng"
LICENSE = "GPL-2.0-only"

PV = "4.3.1"

RPM_NAME = "syslog-ng-mqtt-4.3.1-1.3.aarch64.rpm"
RPM_HASH = "492433132aebac31b6e6dd26d43f73a1428d9c8dd88a1a7759f0a64f7fa00624ad2ce3664530b3f2cddc088836d1d5dbd9e7ef795bf6229471690b2b122f3614"

RPROVIDES:${PN} += "syslog-ng-mqtt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libevtlog-4.3.so.0 \
libglib-2.0.so.0 \
libpaho-mqtt3cs.so.1 \
libsyslog-ng-4.3.so.0 \
syslog-ng"

inherit rpm
