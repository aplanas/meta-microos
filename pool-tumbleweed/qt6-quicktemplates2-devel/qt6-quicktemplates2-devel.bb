SUMMARY = "Qt6 QuickTemplates2 library - Development files"
DESCRIPTION = "Development files for the Qt 6 QuickTemplates2 library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-quicktemplates2-devel-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "3647e1f57ebbec60261e29efcb96b4a133ea6229799f58f90c835cd247fd6b2c1b5e55be4f7eabe4dfe3ceb23341bfd9019a44cac92a433613aac7f973c74d1d"

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
