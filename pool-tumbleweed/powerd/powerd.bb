SUMMARY = "UPS monitoring daemon"
DESCRIPTION = "powerd monitors the serial port connected to an UPS device and will perform \
an unattended shutdown of the system if the UPS is on battery longer \
than a specified number of minutes."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.2"

RPM_NAME = "powerd-2.0.2-1.2.aarch64.rpm"
RPM_HASH = "e79b0983b88bd27aa91b203ff1668ec5426c70fcaf8e40fb496fcae802213daff7ebe904604d41bdc6fc4d28cca7a35cab46f146074d36001b8a67240049dd3b"

RPROVIDES:${PN} += "config-powerd \
powerd"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
