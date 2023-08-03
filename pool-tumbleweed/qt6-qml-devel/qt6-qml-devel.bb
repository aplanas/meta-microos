SUMMARY = "Qt 6 Qml library - Development files"
DESCRIPTION = "Development files for the Qt 6 Qml library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-qml-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "2e7de08606c0a9b6cb83c47d340ef178f6e91da7e06fe92bdf405e1f630e22990b94e8f3bd752d14294e3d4ed38abc82aec0f76a10ecf80f22163fea283c329d"

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
