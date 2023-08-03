SUMMARY = "Qt 6 QuickShapes library - Development files"
DESCRIPTION = "Development files for the Qt 6 QuickShapes library. \
This library does not have any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-quickshapes-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "8a29bb40cf08573d1da6d10802e90165b3fc169fbc234e7b41f6710f763ab9ca504df0ec8755edc47bb9be84b12411746452c6a9de84f063e1e87a93808e3e3b"

RPROVIDES:${PN} += "cmake-Qt6QuickShapesPrivate \
qt6-quickshapes-devel \
qt6-quickshapes-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Qml \
libQt6QuickShapes6 \
qt6-gui-private-devel \
qt6-quick-private-devel"

inherit rpm
