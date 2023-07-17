SUMMARY = "Qt6 Quick3DHelpersImpl library - Development files"
DESCRIPTION = "Development files for the Qt 6 Quick3DHelpersImpl library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-quick3dhelpersimpl-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "46df09a67980d73cfd9b58a1bce4058194532ed72d221cddfd78ee84d4f28c01efb6ab5aacd801d7cf9913b763d6c5688f573a0b3567e9f014c3a27495106b4f"

RPROVIDES:${PN} += "cmake-Qt6Quick3DHelpersImpl \
pkgconfig-Qt6Quick3DHelpersImpl \
qt6-quick3dhelpersimpl-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Qml \
cmake-Qt6Quick \
libQt6Quick3DHelpersImpl6 \
qt6-quick3d-private-devel"

inherit rpm
