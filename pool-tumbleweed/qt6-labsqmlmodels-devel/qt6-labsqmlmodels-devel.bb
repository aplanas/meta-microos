SUMMARY = "Qt 6 LabsQmlModels library - Development files"
DESCRIPTION = "Development files for the Qt 6 LabsQmlModels library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-labsqmlmodels-devel-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "8b2f6fd1c6fa54f5400bf193e66667d8fac4dc26b55d6402b7c6a2db9ec92f8911dec1aab6312b081a5ba0751dbb9d74e9ca42c2884f880809b7e040acd34a3a"

RPROVIDES:${PN} += "cmake-Qt6LabsQmlModels \
pkgconfig-Qt6LabsQmlModels \
qt6-labsqmlmodels-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt6LabsQmlModels6 \
pkgconfig-Qt6Qml \
pkgconfig-Qt6QmlModels \
qt6-qml-private-devel \
qt6-qmlmodels-private-devel"

inherit rpm
