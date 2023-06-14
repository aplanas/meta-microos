SUMMARY = "Qt5 bindings for the Telepathy Library"
DESCRIPTION = "Service library for the Qt5 telepathy binding."
LICENSE = "LGPL-2.1-or-later"

PV = "0.9.8"

RPM_NAME = "libtelepathy-qt5-service1-0.9.8-1.15.aarch64.rpm"
RPM_HASH = "12f04ab79228f6fab49235485e4b0a2d4b71b9ece614bf3881c139e11e42672bcce21fb2017ff80d25ce805090410daa4229cc3315343e85153ef35222a4cab3"

RPROVIDES:${PN} += "libtelepathy-qt5-service.so.1 \
libtelepathy-qt5-service1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Network.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libtelepathy-qt5.so.0"

inherit rpm
