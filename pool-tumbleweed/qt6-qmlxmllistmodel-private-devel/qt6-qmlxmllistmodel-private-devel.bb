SUMMARY = "Non-ABI stable API for the Qt 6 QmlXmlListModel library"
DESCRIPTION = "This package provides private headers of libQt6QmlXmlListModel that do not have \
any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-qmlxmllistmodel-private-devel-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "4ea25bec27c29120b4ed3976c6b1558233febfcecd888ffa8d7dfd79b74648a75808d2c98ad04b2d14ba268636766f8649d1818ac35f27c7b90ff83f396a0fcc"

RPROVIDES:${PN} += "qt6-qmlxmllistmodel-private-devel"

RDEPENDS:${PN} += "cmake-Qt6QmlXmlListModel \
qt6-core-private-devel"

inherit rpm
