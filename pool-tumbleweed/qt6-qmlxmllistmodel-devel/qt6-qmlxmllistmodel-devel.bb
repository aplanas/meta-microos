SUMMARY = "Qt 6 QmlXmlListModel library - Development files"
DESCRIPTION = "Development files for the Qt 6 QmlXmlListModel library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-qmlxmllistmodel-devel-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "0e20cd1a24921efb735156fdbb0ac7f0eabce91f9f55fe150f4e7393d4e59cb8d95f195fc725ff0cd8900020a36aecc37053f42c10a374af483d3d902905ef2a"

RPROVIDES:${PN} += "cmake-Qt6QmlXmlListModel \
pkgconfig-Qt6QmlXmlListModel \
qt6-qmlxmllistmodel-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Qml \
cmake-Qt6QmlModels \
libQt6QmlXmlListModel6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Qml"

inherit rpm
