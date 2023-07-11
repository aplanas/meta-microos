SUMMARY = "Qt6 Quick3DHelpersImpl library - Development files"
DESCRIPTION = "Development files for the Qt 6 Quick3DHelpersImpl library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-quick3dhelpersimpl-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "65cc2518ec39bb50f5c9e6fbca46493c4fc2bb0d6e1c18aa8f849715301deb683a8dfae68c91184d3775b501945272400a4dd773af274c194e91e030a2947328"

RPROVIDES:${PN} += "cmake-Qt6Quick3DHelpersImpl \
pkgconfig-Qt6Quick3DHelpersImpl \
qt6-quick3dhelpersimpl-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Qml \
cmake-Qt6Quick \
libQt6Quick3DHelpersImpl6 \
qt6-quick3d-private-devel"

inherit rpm
