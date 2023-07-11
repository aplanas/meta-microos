SUMMARY = "LVM2 Testsuite"
DESCRIPTION = "An extensive functional testsuite for the LVM2 Logical Volume Manager."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.03.16"

RPM_NAME = "lvm2-testsuite-2.03.16-7.1.aarch64.rpm"
RPM_HASH = "084638366ce1af2ebe1f3032eeaee95babd988f5e362f5b6f0b5b6600043d5edf85e5287179d0d62685870cf08f278ac80b98268b90e287747648c58727829f2"

RPROVIDES:${PN} += "lvm2-testsuite"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/python3 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libaio.so.1 \
libc.so.6 \
libdevmapper.so.1.03 \
libgcc-s.so.1 \
liblvm2cmd2-03 \
libselinux.so.1 \
libstdc++.so.6 \
libudev.so.1 \
lvm2"

inherit rpm
