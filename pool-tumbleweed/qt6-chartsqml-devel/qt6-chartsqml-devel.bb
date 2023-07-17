SUMMARY = "Qt 6 ChartsQml library - Development files"
DESCRIPTION = "Development files for the Qt 6 ChartsQml library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-chartsqml-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "b6869c621150b3f85e320f97ab016a42cd56756fc5094866e37259dd3f54a0ba997a8054b84dc3bf4f7517c4ba3fcf81b8ecdabee91c615955a7548ff53921d4"

RPROVIDES:${PN} += "cmake-Qt6ChartsQml \
pkgconfig-Qt6ChartsQml \
qt6-chartsqml-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Charts \
cmake-Qt6Gui \
cmake-Qt6OpenGL \
cmake-Qt6Qml \
cmake-Qt6Quick \
libQt6ChartsQml6 \
pkgconfig-Qt6Charts \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6OpenGL \
pkgconfig-Qt6Qml \
pkgconfig-Qt6Quick"

inherit rpm
