SUMMARY = "Qt 6 QmlModels library - Development files"
DESCRIPTION = "Development files for the Qt 6 QmlModels library."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-qmlworkerscript-devel-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "2c801a8125a0f27981a760596bef8f70571ef27d1ff38d1355888914e4cee974b98efa083a2e96c74aac0393aeb239224a7ea459febb975436c9e74bcf16c6b5"

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
