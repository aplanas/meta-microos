SUMMARY = "Qt5 bindings for the Telepathy Library"
DESCRIPTION = "Service library for the Qt5 telepathy binding."
LICENSE = "LGPL-2.1-or-later"

PV = "0.9.8"

RPM_NAME = "libtelepathy-qt5-service1-0.9.8-1.15.aarch64.rpm"
RPM_HASH = "12f04ab79228f6fab49235485e4b0a2d4b71b9ece614bf3881c139e11e42672bcce21fb2017ff80d25ce805090410daa4229cc3315343e85153ef35222a4cab3"

RPROVIDES:${PN} += "libtelepathy-qt5-service.so.1()(64bit) \
libtelepathy-qt5-service1 \
libtelepathy-qt5-service1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libtelepathy-qt5.so.0()(64bit)"

inherit rpm
