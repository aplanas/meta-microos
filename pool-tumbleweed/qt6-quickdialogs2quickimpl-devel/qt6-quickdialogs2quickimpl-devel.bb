SUMMARY = "Qt6 QuickDialogs2Impl library - Development files"
DESCRIPTION = "Development files for the Qt 6 QuickDialogs2Impl library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-quickdialogs2quickimpl-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "9ee85a51a8c3afe6e672ee06d580a1e59a4c97bcd8dcec3a49b56cc5ac18d06413fae997b3d21897248d22e696757dea86753e33fd32a62b9f8f45037da04db9"

RPROVIDES:${PN} += "cmake-Qt6QuickDialogs2QuickImpl \
pkgconfig-Qt6QuickDialogs2QuickImpl \
qt6-quickdialogs2quickimpl-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
cmake-Qt6Qml \
cmake-Qt6Quick \
cmake-Qt6QuickControls2Impl \
cmake-Qt6QuickDialogs2Utils \
cmake-Qt6QuickTemplates2 \
libQt6QuickDialogs2QuickImpl6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Quick"

inherit rpm
