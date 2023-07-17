SUMMARY = "Qt 6 QmlModels library - Development files"
DESCRIPTION = "Development files for the Qt 6 QmlModels library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-qmlmodels-devel-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "1712b78e2de49990f208c2f88f0c558e0dca78d0b8bbd8fca43ad5001c023ddc50a1f6e81ab0b4b3e3d21a51cf528a2d481d4bbb57f298f1cd87c3fecad8e870"

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
