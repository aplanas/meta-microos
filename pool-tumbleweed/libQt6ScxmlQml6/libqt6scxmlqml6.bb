SUMMARY = "Qt 6 ScxmlQml library"
DESCRIPTION = "The Qt6 ScxmlQml library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6ScxmlQml6-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "86c9b6dc9d433a3fdf43a587328c35e70ca69028d73d376c43e081b107fc60c946d038a49a032a342ba34dec2124eeffb5d35622b18c1470a75951c4a3762e4d"

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
