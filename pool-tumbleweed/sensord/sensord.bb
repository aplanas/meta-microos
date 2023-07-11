SUMMARY = "Hardware health monitoring daemon"
DESCRIPTION = "sensord is a daemon that can be used to periodically log sensor \
readings from hardware health-monitoring chips to the system logs or a \
round-robin database (RRD) and to alert when a sensor alarm is \
signalled; for example, if a fan fails, a temperature limit is \
exceeded, etc."
LICENSE = "GPL-2.0-or-later"

PV = "3.6.0"

RPM_NAME = "sensord-3.6.0-8.8.aarch64.rpm"
RPM_HASH = "78ec552fad59de623898aead49ceabc9c5c3ed37182c1cf66916433c45370c7f206769b016d4d4b1b8d7a193df40c9e3ebfc1cbe3bbb1a3e13eb53ad1a99069b"

RPROVIDES:${PN} += "sensord \
sensors-/usr/sbin/sensord"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6 \
librrd.so.8 \
libsensors.so.4"

inherit rpm
