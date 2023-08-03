SUMMARY = "Qt6 Quick3DHelpersImpl library - Development files"
DESCRIPTION = "Development files for the Qt 6 Quick3DHelpersImpl library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-quick3dhelpersimpl-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "3151865f9b43334e9e769ee90efd4d1c5d4845282c4f6b93df557503472893a66f088d35947d472c3521374dc902071c61063a9842640d3ae20361a21c68593f"

RPROVIDES:${PN} += "cmake-Qt6Quick3DHelpersImpl \
pkgconfig-Qt6Quick3DHelpersImpl \
qt6-quick3dhelpersimpl-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Qml \
cmake-Qt6Quick \
libQt6Quick3DHelpersImpl6 \
qt6-quick3d-private-devel"

inherit rpm
