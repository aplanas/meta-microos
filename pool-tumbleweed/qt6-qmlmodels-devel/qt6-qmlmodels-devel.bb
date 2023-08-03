SUMMARY = "Qt 6 QmlModels library - Development files"
DESCRIPTION = "Development files for the Qt 6 QmlModels library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-qmlmodels-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "a3d6e33d52f881b7fb2b13f67dfd204209e3365534718513052c150f817420d7e0f351611c6f869aae551fcf5413d9443da1341fa29efffc93cead7f9beaa218"

RPROVIDES:${PN} += "cmake-Qt6QmlModels \
pkgconfig-Qt6QmlModels \
qt6-qmlmodels-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Core \
cmake-Qt6Qml \
libQt6QmlModels6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Qml"

inherit rpm
