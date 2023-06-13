SUMMARY = "Dynamic Pixel Format Translation Library"
DESCRIPTION = "babl is a dynamic, any to any, pixel format translation library. \
 \
It allows converting between different methods of storing pixels known \
as pixel formats that have with different bitdepths and other data \
representations, color models and component permutations. \
 \
A vocabulary to formulate new pixel formats from existing primitives is \
provided as well as the framework to add new color models and data \
types."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "0.1.106"

RPM_NAME = "libbabl-0_1-0-0.1.106-1.1.aarch64.rpm"
RPM_HASH = "5a0dd869117f2bd41942eb9ba7f5aa1659c737b3d2ad739f6607d5a34bcd1c944a70a9a8617a2754564182257033751940050c7e002b842f341f376e5c5019f2"

RPROVIDES:${PN} += "libbabl-0.1.so.0()(64bit) \
libbabl-0.1.so.0(V0_1_0)(64bit) \
libbabl-0_1-0 \
libbabl-0_1-0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
liblcms2.so.2()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
