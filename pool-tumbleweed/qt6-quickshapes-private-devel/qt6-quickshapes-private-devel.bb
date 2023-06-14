SUMMARY = "Qt 6 QuickShapes library - Development files"
DESCRIPTION = "Development files for the Qt 6 QuickShapes library. \
This library does not have any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-quickshapes-private-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "3989767a42be649b2bd1556c71ce161b1b21513dd9108ef09f6ea28eeebccd48b287e5f566fc93da13373ff8dbb61112d65ae3c51b633e91ff49b42758e29357"

RPROVIDES:${PN} += "cmake-Qt6QuickShapesPrivate \
qt6-quickshapes-devel \
qt6-quickshapes-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Qml \
libQt6QuickShapes6 \
qt6-gui-private-devel \
qt6-quick-private-devel"

inherit rpm
