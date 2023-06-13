SUMMARY = "Qt6 QuickTemplates2 library - Development files"
DESCRIPTION = "Development files for the Qt 6 QuickTemplates2 library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-quicktemplates2-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "d988ef7b581fa8ea217fc8b6c5b36b952c2ff28fc205549b98ac60fbdd631fd8d536a4786e24d4c2491454ff01b709bf7f3303c06cdcb75b7b74ae581ce0beee"

RPROVIDES:${PN} += "cmake(Qt6QuickTemplates2) \
pkgconfig(Qt6QuickTemplates2) \
qt6-quicktemplates2-devel \
qt6-quicktemplates2-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake(Qt6Gui) \
cmake(Qt6QmlModels) \
libQt6QuickTemplates2-6 \
pkgconfig(Qt6Core) \
pkgconfig(Qt6Gui) \
pkgconfig(Qt6QmlModels) \
pkgconfig(Qt6Quick) \
qt6-qml-private-devel"

inherit rpm
