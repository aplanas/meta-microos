SUMMARY = "Non-ABI stable API for the Qt 6 QmlXmlListModel library"
DESCRIPTION = "This package provides private headers of libQt6QmlXmlListModel that do not have \
any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-qmlxmllistmodel-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "89f0e7d6e5b4aebb26228d072def8c5d88d541caf7549bb9cd6d4e2c34599ae2a9289e10e5b7ec2afcf69d662c94ed11015d95038f28b0406a1ff95b3b7fea1a"

RPROVIDES:${PN} += "qt6-qmlxmllistmodel-private-devel"

RDEPENDS:${PN} += "cmake-Qt6QmlXmlListModel \
qt6-core-private-devel"

inherit rpm
