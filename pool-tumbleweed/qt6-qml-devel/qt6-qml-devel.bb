SUMMARY = "Qt 6 Qml library - Development files"
DESCRIPTION = "Development files for the Qt 6 Qml library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-qml-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "810e7f5061b0aec84369d3cb96297263ddf500c0d2f2898483fe4227e820517ffc70a844b331a0d748a3f395f207ced2b74f302ac061bbfde04502edffde0581"

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
