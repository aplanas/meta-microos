SUMMARY = "Qt6 Quick3DUtils library - Development files"
DESCRIPTION = "Development files for the Qt 6 Quick3DUtils library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-quick3dutils-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "8792073092ec36793b0ffe1a0827e0a1d7caf19cc50f91a8a5a689d4e72a42aa740c335732caba913a2e0cd06bbc472ba2cb1a5498cbc56d081bf293c1dc3859"

RPROVIDES:${PN} += "cmake-Qt6Quick3DUtils \
pkgconfig-Qt6Quick3DUtils \
qt6-quick3dutils-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
cmake-Qt6Quick \
libQt6Quick3DUtils6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui"

inherit rpm
