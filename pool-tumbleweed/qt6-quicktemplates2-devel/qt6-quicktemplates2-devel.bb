SUMMARY = "Qt6 QuickTemplates2 library - Development files"
DESCRIPTION = "Development files for the Qt 6 QuickTemplates2 library."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-quicktemplates2-devel-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "e379259b3e06cb7c74fa5e605fff566b000ff4b1f6abe57a84eba89d17e2b66547fc00ca813617bfbe69531b94d864314a8eb174e3eb9f2faf811778097c8b13"

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
