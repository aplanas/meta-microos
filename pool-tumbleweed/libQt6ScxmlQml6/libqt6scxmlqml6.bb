SUMMARY = "Qt 6 ScxmlQml library"
DESCRIPTION = "The Qt6 ScxmlQml library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6ScxmlQml6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "9853a5ba11a2da1f032634669b46c66fe660dcff9b0d182833a3736c6dfea7f563b4744e88eb4849574f5ad4a25d5aaba486c7bbb6376a1231e5984401b7adbf"

RPROVIDES:${PN} += "libQt6ScxmlQml.so.6 \
libQt6ScxmlQml6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libQt6Scxml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
