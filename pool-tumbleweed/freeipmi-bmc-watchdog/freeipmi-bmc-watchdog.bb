SUMMARY = "FreeIPMI BMC watchdog"
DESCRIPTION = "Provides a watchdog daemon for OS monitoring and recovery."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.11"

RPM_NAME = "freeipmi-bmc-watchdog-1.6.11-1.1.aarch64.rpm"
RPM_HASH = "a3b8173bb8127b3727eb9cb85053f1eaab5b4e27c2078e66a0e010a534505f8aad4057d28ab665b537138a6d9cb9e574c9a256a8543ef62f36a2cf0bce7996ea"

RPROVIDES:${PN} += "freeipmi-bmc-watchdog"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
freeipmi \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfreeipmi.so.17 \
logrotate \
systemd"

inherit rpm
