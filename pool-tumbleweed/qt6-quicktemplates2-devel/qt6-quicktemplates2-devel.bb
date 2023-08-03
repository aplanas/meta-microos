SUMMARY = "Qt6 QuickTemplates2 library - Development files"
DESCRIPTION = "Development files for the Qt 6 QuickTemplates2 library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-quicktemplates2-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "64597da7c38a0ecd66342837378ed08e39b5406b8e2ac44a496b04a4091ce3f83222fb496cd7eb079a74dadf462b9865801136d9504f17f15d83227b4d4435f1"

RPROVIDES:${PN} += "cmake-Qt6QuickTemplates2 \
pkgconfig-Qt6QuickTemplates2 \
qt6-quicktemplates2-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
cmake-Qt6Qml \
cmake-Qt6QmlModels \
cmake-Qt6Quick \
libQt6QuickTemplates2-6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6QmlModels \
pkgconfig-Qt6Quick"

inherit rpm
