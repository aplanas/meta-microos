SUMMARY = "Qt 6 Qml library - Development files"
DESCRIPTION = "Development files for the Qt 6 Qml library."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-qml-devel-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "8d1231c2e84b9c3580f001183a2adf0741846484956d3307c9c41f6afc8c41a67841cb78b1fd78dec03899917841d1fd14058871688babfd6b5b4e78f198acb0"

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
