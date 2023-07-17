SUMMARY = "Qt 6 QmlXmlListModel library"
DESCRIPTION = "The Qt 6 QmlXmlListModel library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6QmlXmlListModel6-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "c0237159b1175912d8eb5c0e9bd552fc224dd3fe6d70c96be9a378f79f65072f4b023869b049359cba7656dea791507cb275b8631bbcb84b1c4b6f8ab31c714a"

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
