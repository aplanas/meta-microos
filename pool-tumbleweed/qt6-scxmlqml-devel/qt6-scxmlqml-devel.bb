SUMMARY = "Qt 6 ScxmlQml library - Development files"
DESCRIPTION = "Development files for the Qt 6 ScxmlQml library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-scxmlqml-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "77f05fc5eac8e41b869ab81a25ab5060319f2e53ee75f64a2b1ed0a092454d0b28eaf91d96c61eddded4273201ba6093448eb25cbd6be11c4391cc9cb0caeb01"

RPROVIDES:${PN} += "cmake-Qt6ScxmlQml \
pkgconfig-Qt6ScxmlQml \
qt6-scxmlqml-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Qml \
cmake-Qt6Scxml \
libQt6ScxmlQml6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Qml \
pkgconfig-Qt6Scxml"

inherit rpm
