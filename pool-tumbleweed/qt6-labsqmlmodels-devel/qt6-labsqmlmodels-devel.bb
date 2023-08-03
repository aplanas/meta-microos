SUMMARY = "Qt 6 LabsQmlModels library - Development files"
DESCRIPTION = "Development files for the Qt 6 LabsQmlModels library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-labsqmlmodels-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "7020d5686e93aa5a866d1b66927fe6a961072f7f07af5f6ac5a8b65cd7bee1d4eff8d8bfd4228c24143bfc48df4fb887791b8b01076ba6fd8416ebea2e931e88"

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
