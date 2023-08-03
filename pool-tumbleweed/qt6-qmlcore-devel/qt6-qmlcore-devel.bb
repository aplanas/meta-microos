SUMMARY = "Qt 6 QmlCore library - Development files"
DESCRIPTION = "Development files for the Qt 6 QmlCore library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-qmlcore-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "b36d23dce7b68961319bb500363e85241fc1f65d59049db481124130f6d0fbccfbca199aa38945fdfce198330756704a7a47b9d9926c82bb42e7d295428d1307"

RPROVIDES:${PN} += "cmake-Qt6QmlCore \
pkgconfig-Qt6QmlCore \
qt6-qmlcore-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Qml \
libQt6QmlCore6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Qml"

inherit rpm
