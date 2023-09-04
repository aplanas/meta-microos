SUMMARY = "Qt 6 QmlXmlListModel library - Development files"
DESCRIPTION = "Development files for the Qt 6 QmlXmlListModel library."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-qmlxmllistmodel-devel-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "4900e5c6c5eccabf38fc914747d29fdafe8177ce1dcc26b5aacda1314eb601db05221bc0f455e8d4fc6c6a8f8f09b1bf4abe78eafa67080f85f79ace3841da15"

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
