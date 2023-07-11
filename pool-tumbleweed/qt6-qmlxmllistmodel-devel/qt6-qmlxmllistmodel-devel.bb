SUMMARY = "Qt 6 QmlXmlListModel library - Development files"
DESCRIPTION = "Development files for the Qt 6 QmlXmlListModel library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-qmlxmllistmodel-devel-6.5.1-1.3.aarch64.rpm"
RPM_HASH = "0b3b6fdf8bebe65692bce8a9cbd95c3b9163b8a817a1401ff41734ad36abefcbad475663527f5edb6b056722ef89a9118a69ed4ca366332b2875c53cacce78f2"

RPROVIDES:${PN} += "cmake-Qt6QmlXmlListModel \
pkgconfig-Qt6QmlXmlListModel \
qt6-qmlxmllistmodel-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Qml \
libQt6QmlXmlListModel6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Qml"

inherit rpm
