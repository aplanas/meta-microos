SUMMARY = "Qt 6 QmlModels library - Development files"
DESCRIPTION = "Development files for the Qt 6 QmlModels library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-qmlworkerscript-devel-6.5.1-1.3.aarch64.rpm"
RPM_HASH = "e750c9d1743cc2de42b02455a4504a2eb267f81fab9aa5f433375a2a89bbaaeeda46f223a112d7b1078cef8e24f35effe2763aa76d002d302fb05cd2f30bab75"

RPROVIDES:${PN} += "cmake-Qt6QmlWorkerScript \
pkgconfig-Qt6QmlWorkerScript \
qt6-qmlworkerscript-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Core \
cmake-Qt6Qml \
libQt6QmlWorkerScript6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Qml"

inherit rpm
