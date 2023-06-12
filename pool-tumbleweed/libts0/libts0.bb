SUMMARY = "Abstraction layer for touchscreens"
DESCRIPTION = "Tslib is an abstraction layer for touchscreen panel events. \
 \
The idea of tslib is to have a core library and a set of plugins to \
manage the conversion and filtering as needed."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-only"

PV = "1.22"

RPM_NAME = "libts0-1.22-1.9.aarch64.rpm"
RPM_HASH = "18c2a4f840a2b1580fc9cb3c5f2b5911e1064b62559082ac1f1151db714b24235bc809e9f119e94eb003f37f9b840369173a3c3035a5a2b112a89633da8b54d6"

RPROVIDES:${PN} += "libts.so.0()(64bit) \
libts0 \
libts0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
