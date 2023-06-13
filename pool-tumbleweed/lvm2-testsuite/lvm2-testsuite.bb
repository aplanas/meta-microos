SUMMARY = "LVM2 Testsuite"
DESCRIPTION = "An extensive functional testsuite for the LVM2 Logical Volume Manager."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.03.16"

RPM_NAME = "lvm2-testsuite-2.03.16-6.3.aarch64.rpm"
RPM_HASH = "1997c7f54707a7fd286c9c097d7e176200c58eb0d2932424f85c4c454c74de50694b3614d5932e1c3811a5dd9c1922236073ac14870e79cd0f885d60497a67dd"

RPROVIDES:${PN} += "lvm2-testsuite \
lvm2-testsuite(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/env \
/usr/bin/python3 \
ld-linux-aarch64.so.1()(64bit) \
libaio.so.1()(64bit) \
libc.so.6()(64bit) \
libdevmapper.so.1.03()(64bit) \
libdevmapper.so.1.03(Base)(64bit) \
libgcc_s.so.1()(64bit) \
liblvm2cmd2_03 \
libselinux.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libudev.so.1()(64bit) \
libudev.so.1(LIBUDEV_183)(64bit) \
lvm2"

inherit rpm
