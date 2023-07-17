SUMMARY = "Qt 6 QuickShapes library - Development files"
DESCRIPTION = "Development files for the Qt 6 QuickShapes library. \
This library does not have any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-quickshapes-private-devel-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "39f7abee7bf46a2486dee96ee57cd2f44b0764d0e527b374d9d45f7c6890887d7708d8772cb1891013087612b44ff87fa034236b1faeb6f2b07be9a302c0e842"

RPROVIDES:${PN} += "cmake-Qt6QuickShapesPrivate \
qt6-quickshapes-devel \
qt6-quickshapes-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Qml \
libQt6QuickShapes6 \
qt6-gui-private-devel \
qt6-quick-private-devel"

inherit rpm
