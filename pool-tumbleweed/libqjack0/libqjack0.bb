SUMMARY = "Connect to the Jack Sound Server with Qt"
DESCRIPTION = "QJack makes you connect with the Jack soundserver system with Qt."
LICENSE = "GPL-2.0-or-later"

PV = "0.0+20170112"

RPM_NAME = "libqjack0-0.0+20170112-3.22.aarch64.rpm"
RPM_HASH = "0a088761abb81ba543305ed6a7a668a6877f15992cba0a60752b5e650a5a0e685ac339a6ab673ddc6108bd12d52c6c7c5048751e88da999f2535099bb7692913"

RPROVIDES:${PN} += "libqjack.so.0 \
libqjack0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libjack.so.0 \
libstdc++.so.6"

inherit rpm
