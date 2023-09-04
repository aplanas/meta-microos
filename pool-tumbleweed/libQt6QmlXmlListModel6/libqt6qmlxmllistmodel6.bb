SUMMARY = "Qt 6 QmlXmlListModel library"
DESCRIPTION = "The Qt 6 QmlXmlListModel library."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "libQt6QmlXmlListModel6-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "703a3271570b1515ae0c5248947623d95f982d58688c206f5cab5518b19602ec5d18db412be94974a73d866b00b5fcc1a8bfab065fcfcce333e3ea886a572c8c"

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
