SUMMARY = "Qt 6 Sensors library"
DESCRIPTION = "The Qt 6 Sensors library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "libQt6Sensors6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "6788986d67428f8f51c19341cb946e5b857d6804dfe473e2eb1a3c97fbb6b4eef002bc1adce5e2f0de41b535f5a6ff95bf0217520a050a7262232043ea4f7ddd"

RPROVIDES:${PN} += "libQt6Sensors.so.6 \
libQt6Sensors6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
