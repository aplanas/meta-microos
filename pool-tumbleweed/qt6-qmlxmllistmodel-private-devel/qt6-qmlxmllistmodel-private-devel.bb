SUMMARY = "Non-ABI stable API for the Qt 6 QmlXmlListModel library"
DESCRIPTION = "This package provides private headers of libQt6QmlXmlListModel that do not have \
any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-qmlxmllistmodel-private-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "3a876578b27dcba2003e267a21872edc50f7aa59847534cfe1e1ecd635fb277911a530567b28df4d06607c488fbf211741aff70bd80436c31112975304b7b88b"

RPROVIDES:${PN} += "qt6-qmlxmllistmodel-private-devel"

RDEPENDS:${PN} += "cmake-Qt6QmlXmlListModel \
qt6-core-private-devel"

inherit rpm
