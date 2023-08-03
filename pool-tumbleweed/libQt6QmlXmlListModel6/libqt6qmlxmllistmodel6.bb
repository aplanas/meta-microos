SUMMARY = "Qt 6 QmlXmlListModel library"
DESCRIPTION = "The Qt 6 QmlXmlListModel library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "libQt6QmlXmlListModel6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "6faa6f7dd445d23a7edf5d3621f3d9417d3dfa3dfefd81e9505d9dd341dc7419fc0f5dcbf63fee57c42585d1bc4d1b48828b16ceca3e4227fb334073136d136b"

RPROVIDES:${PN} += "libQt6QmlXmlListModel.so.6 \
libQt6QmlXmlListModel6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Network.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
