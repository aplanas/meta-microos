SUMMARY = "FreeIPMI BMC watchdog"
DESCRIPTION = "Provides a watchdog daemon for OS monitoring and recovery."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.10"

RPM_NAME = "freeipmi-bmc-watchdog-1.6.10-1.3.aarch64.rpm"
RPM_HASH = "a3bc6b9b6f102eb88c9809c81a9737e3941e781c032d2abd02de7cdd2bd80a76eba0a58a2b70b625997d5a4b33891371c0800b0ac497fe30700321eccf06c8a2"

RPROVIDES:${PN} += "freeipmi-bmc-watchdog \
freeipmi-bmc-watchdog(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/mkdir \
/usr/bin/touch \
fillup \
freeipmi \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libfreeipmi.so.17()(64bit) \
logrotate \
systemd"

inherit rpm
