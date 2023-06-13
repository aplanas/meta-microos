SUMMARY = "Xspice code model Plugins"
DESCRIPTION = "Ngspice is a mixed-level/mixed-signal circuit simulator. Its code \
is based on three open source software packages: Spice3f5, Cider1b1 \
and Xspice. This package contains the Xspice code model plugins."
LICENSE = "BSD-2-Clause"

PV = "40"

RPM_NAME = "ngspice-xspice-cm-40-1.1.aarch64.rpm"
RPM_HASH = "829eaa836c32eac7bcdab40821e63ff8e77f83a85ec0a63c9f483fcb294c0888912870d1238f213c161c1fefbd64ed6a49ece982f20762bc07bf86d110e1f3b1"

RPROVIDES:${PN} += "ngspice-xspice-cm \
ngspice-xspice-cm(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libm.so.6(GLIBC_2.35)(64bit)"

inherit rpm
