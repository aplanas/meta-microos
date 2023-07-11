SUMMARY = "Polls system event logs (SEL)"
DESCRIPTION = "The daemon  polls  the system event log (SEL) of specified hosts and stores the \
logs into the local syslog. By default, the daemon can also make best efforts \
to manage the remote SEL buffer to ensure events are never lost. \
Recent logging data will be cached to disk to ensure that SEL events are \
not missed in the event the client or server is rebooted."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.11"

RPM_NAME = "freeipmi-ipmiseld-1.6.11-1.1.aarch64.rpm"
RPM_HASH = "47ea68965d30e09a54b86dfbc45043d782f34435e451981d493bf7c90ced0a561941f3b23a3f3884323ea36ddc623c0b3d720c25402580cc6f7a59ecc377de5a"

RPROVIDES:${PN} += "config-freeipmi-ipmiseld \
freeipmi-/usr/sbin/ipmiseld \
freeipmi-ipmiseld"

RDEPENDS:${PN} += "/usr/bin/sh \
freeipmi \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfreeipmi.so.17 \
systemd"

inherit rpm
