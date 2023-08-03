SUMMARY = "Qt 6 ScxmlQml library"
DESCRIPTION = "The Qt6 ScxmlQml library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "libQt6ScxmlQml6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "92e355a8f2839590ce8842b0fe9a2d673a69ed32f4c80dd463b20d663dfe07686cd1637fad7dda7c97b4093b57f4fcb6bc149b78bc5b693d974b5462d76cb679"

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
