SUMMARY = "Qt 6 QmlXmlListModel library - Development files"
DESCRIPTION = "Development files for the Qt 6 QmlXmlListModel library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-qmlxmllistmodel-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "70fd0189fed17054e0e9729d650879d051fde0af4682424ec1958404ffe31b916aea54bea92c7db7b486468765d3e201a2724e3645143ee4a6f10d68803d0b37"

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
