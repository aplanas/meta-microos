SUMMARY = "Qt 6 QmlCore library - Development files"
DESCRIPTION = "Development files for the Qt 6 QmlCore library."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-qmlcore-devel-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "439ad571c65ec33d9d013da90c2a89434b21ddf9544ef840eae360b740b3ac03256828ea4b7eee32fbcd3d42a9b31172c15d00df4670f99f7c22edc1d5c695e2"

RPROVIDES:${PN} += "cmake-Qt6QmlCore \
pkgconfig-Qt6QmlCore \
qt6-qmlcore-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Qml \
libQt6QmlCore6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Qml"

inherit rpm
