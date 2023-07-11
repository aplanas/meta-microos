SUMMARY = "Qt 6 Sensors library"
DESCRIPTION = "The Qt 6 Sensors library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6Sensors6-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "145160fc2e838db46d697ac993ff6140d431c1f7cd58b7e94d3b9d567d17185dcbb9b5f3ba5721a4fdb29232becc3c6f26c9533bc0d9480397624b49e7f0bc3e"

RPROVIDES:${PN} += "libQt6Sensors.so.6 \
libQt6Sensors6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
