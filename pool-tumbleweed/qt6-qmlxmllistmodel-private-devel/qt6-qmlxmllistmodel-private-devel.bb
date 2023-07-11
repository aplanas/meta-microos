SUMMARY = "Non-ABI stable API for the Qt 6 QmlXmlListModel library"
DESCRIPTION = "This package provides private headers of libQt6QmlXmlListModel that do not have \
any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-qmlxmllistmodel-private-devel-6.5.1-1.3.aarch64.rpm"
RPM_HASH = "06074c9e429e4bc40ac07110fcf3be9228f58f9932a5a5675198580607874ddfc70c0fd28e5b0babdf14c8bd1994c547ebf0c7f22d0b4f599930ad0089ffab33"

RPROVIDES:${PN} += "qt6-qmlxmllistmodel-private-devel"

RDEPENDS:${PN} += "cmake-Qt6QmlXmlListModel \
qt6-core-private-devel"

inherit rpm
