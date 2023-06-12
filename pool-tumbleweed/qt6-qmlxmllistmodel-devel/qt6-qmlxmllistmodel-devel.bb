SUMMARY = "Qt 6 QmlXmlListModel library - Development files"
DESCRIPTION = "Development files for the Qt 6 QmlXmlListModel library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-qmlxmllistmodel-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "66b9697a6fe69627386ba94364b56b155c05cce894c7579ea33d4da97e55afca7b18b86f763dc891cd2afa26d8d15951244c73d20d9085880a517c2bf4a23f70"

RPROVIDES:${PN} += "cmake(Qt6QmlXmlListModel) \
pkgconfig(Qt6QmlXmlListModel) \
qt6-qmlxmllistmodel-devel \
qt6-qmlxmllistmodel-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake(Qt6Qml) \
libQt6QmlXmlListModel6 \
pkgconfig(Qt6Core) \
pkgconfig(Qt6Qml)"

inherit rpm
