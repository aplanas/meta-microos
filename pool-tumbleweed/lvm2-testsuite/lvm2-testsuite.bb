SUMMARY = "LVM2 Testsuite"
DESCRIPTION = "An extensive functional testsuite for the LVM2 Logical Volume Manager."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.03.16"

RPM_NAME = "lvm2-testsuite-2.03.16-6.3.aarch64.rpm"
RPM_HASH = "1997c7f54707a7fd286c9c097d7e176200c58eb0d2932424f85c4c454c74de50694b3614d5932e1c3811a5dd9c1922236073ac14870e79cd0f885d60497a67dd"

RPROVIDES:${PN} += "lvm2-testsuite"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/env \
/usr/bin/python3 \
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
