SUMMARY = "Qt 6 Qml library - Development files"
DESCRIPTION = "Development files for the Qt 6 Qml library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-qml-devel-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "548533d985b6992084a0e091d530da1ba5e302ccd16956ae4b37203d3ef5fe2a96e2416baf4d6374221b9e1f61bfedc0d53024cb93b8d894b524346524abf143"

RPROVIDES:${PN} += "cmake-Qt6Qml \
cmake-Qt6QmlImportScanner \
cmake-Qt6QmlIntegration \
cmake-Qt6QmlTools \
pkgconfig-Qt6Qml \
pkgconfig-Qt6QmlIntegration \
qt6-qml-devel \
qt6-qmldevtools-devel-static"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Network \
libQt6Qml6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Network \
pkgconfig-Qt6QmlIntegration \
qt6-declarative-tools"

inherit rpm
