SUMMARY = "Non-ABI stable API for the Qt 6 QmlXmlListModel library"
DESCRIPTION = "This package provides private headers of libQt6QmlXmlListModel that do not have \
any ABI or API guarantees."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-qmlxmllistmodel-private-devel-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "b5866be6b497aaed280706969bc6f629f8ba1e0483e141d1af3578918cd0ece84a2089cc80a7fc8e28e01e299514e92d5bfbc49af82635be686b499c427bba5e"

RPROVIDES:${PN} += "qt6-qmlxmllistmodel-private-devel"

RDEPENDS:${PN} += "cmake-Qt6QmlXmlListModel \
qt6-core-private-devel"

inherit rpm
