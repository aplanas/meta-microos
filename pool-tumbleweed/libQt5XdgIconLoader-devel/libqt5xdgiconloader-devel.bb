SUMMARY = "Devel files for libQt5XdgIconLoader"
DESCRIPTION = "Development files for QtXDG icon loader libraries used in LXQt"
LICENSE = "GPL-3.0-only"

PV = "3.11.0"

RPM_NAME = "libQt5XdgIconLoader-devel-3.11.0-1.3.aarch64.rpm"
RPM_HASH = "c15f1c47bed3ecd91362595fb94e35826f013f91832e17b3dcb44d4523cdef460ab97a2e4c1ee72e626e88de066e8b1a8c5e4af8f4a6ce5ba07a267bcb12e5c1"

RPROVIDES:${PN} += "cmake-qt5xdgiconloader \
libQt5XdgIconLoader-devel \
libQt5XdgIconPlugin.so \
pkgconfig-Qt5XdgIconLoader"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5XdgIconLoader.so.3 \
libQt5XdgIconLoader3 \
libc.so.6 \
libstdc++.so.6 \
pkgconfig-Qt5Gui \
pkgconfig-Qt5Svg"

inherit rpm
