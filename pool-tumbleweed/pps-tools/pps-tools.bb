SUMMARY = "Userspace tools for the Linux Pulse Per Second subsystem"
DESCRIPTION = "Userland tools to test Linux kernel PPS API. See Documentations/pps/pps.txt \
for reference."
LICENSE = "GPL-2.0-or-later"

PV = "0.0.0+git.20211122"

RPM_NAME = "pps-tools-0.0.0+git.20211122-1.2.aarch64.rpm"
RPM_HASH = "a464ffb1bd4fa8cee1f12eeb83415dd4c3b2a49d0963ca83009ec39482bdb17fedd15c487fa4787661cccac9bff712454026ebb4e8e8b728ba96b7bc69449228"

RPROVIDES:${PN} += "pps-tools"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
pps-udev"

inherit rpm
