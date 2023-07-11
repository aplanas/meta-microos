SUMMARY = "Qt6 QuickTemplates2 library - Development files"
DESCRIPTION = "Development files for the Qt 6 QuickTemplates2 library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-quicktemplates2-devel-6.5.1-1.3.aarch64.rpm"
RPM_HASH = "32de7be8da6f8968be82a535684eb982abf6e83d5b19946dab4e21fc98a390725162f082f61418e89d41902a109c06f086d5f19cd324902c33148332c3ad46fd"

RPROVIDES:${PN} += "cmake-Qt6QuickTemplates2 \
pkgconfig-Qt6QuickTemplates2 \
qt6-quicktemplates2-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
cmake-Qt6QmlModels \
libQt6QuickTemplates2-6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6QmlModels \
pkgconfig-Qt6Quick \
qt6-qml-private-devel"

inherit rpm
