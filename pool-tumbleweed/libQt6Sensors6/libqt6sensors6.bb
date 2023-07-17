SUMMARY = "Qt 6 Sensors library"
DESCRIPTION = "The Qt 6 Sensors library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6Sensors6-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "dd09462d33f79fb80455ac32d4fae6670f68d4d5321c822a02e8769873b49dd0ab0f46950518574ee9836d3ae92f1baff1a27c0958b3dc953bd5859bf9300894"

RPROVIDES:${PN} += "libQt6Sensors.so.6 \
libQt6Sensors6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
