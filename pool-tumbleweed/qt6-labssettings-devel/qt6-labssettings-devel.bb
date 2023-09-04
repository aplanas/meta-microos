SUMMARY = "Qt 6 LabsSettings library - Development files"
DESCRIPTION = "Development files for the Qt 6 LabsSettings library."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-labssettings-devel-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "73e056f0d5d8e479b2f7226c6d1af6f36b89521846a388997a18e23f3d10b604028d2d07eaffab9e0d0dbdaf5fa8926e9c179e55cd84dd67fab2f327fb3c1871"

RPROVIDES:${PN} += "cmake-Qt6LabsSettings \
pkgconfig-Qt6LabsSettings \
qt6-labssettings-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Core \
cmake-Qt6Qml \
libQt6LabsSettings6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Qml"

inherit rpm
