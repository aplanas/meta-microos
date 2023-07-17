SUMMARY = "Qt6 QuickDialogs2 library - Development files"
DESCRIPTION = "Development files for the Qt 6 QuickDialogs2 library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-quickdialogs2-devel-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "4ea30362610f8fb23e146b238d865639f3971c108bdfa1e050b3e9486d1cf400603a349d6e36b4962423f6ec7417034b261d985e9ed3af953b0636c124c5e0a2"

RPROVIDES:${PN} += "cmake-Qt6QuickDialogs2 \
pkgconfig-Qt6QuickDialogs2 \
qt6-quickdialogs2-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
cmake-Qt6Qml \
cmake-Qt6Quick \
cmake-Qt6QuickControls2Impl \
cmake-Qt6QuickDialogs2QuickImpl \
cmake-Qt6QuickDialogs2Utils \
libQt6QuickDialogs2-6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Quick"

inherit rpm
