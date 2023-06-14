SUMMARY = "Library used to query system info and statistics"
DESCRIPTION = "Development libraries for libsysstat."
LICENSE = "LGPL-2.1-or-later"

PV = "0.4.6"

RPM_NAME = "libsysstat-qt5-0-0.4.6-1.8.aarch64.rpm"
RPM_HASH = "ccb3cbd81c7a6f4247bebdab17e56b4098bba38139e0470ff2d8e308bb908778196a861fa8e4968b8a47319558be2fdfec3789d87d92f87bc9151c6f41425dc3"

RPROVIDES:${PN} += "libsysstat \
libsysstat-qt5-0 \
libsysstat-qt5.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
