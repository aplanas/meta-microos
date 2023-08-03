SUMMARY = "Qt 6 QmlCore library"
DESCRIPTION = "The Qt 6 QmlCore library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "libQt6QmlCore6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "69e6b761aa8ca9ffaa0babf9ad184d9f3681e5d5dba5cc97506e50dcc62a34d036b27b9ca87cc8d4e564725bc5276fdf142e11456aed7dbb6c5191130a2e794c"

RPROVIDES:${PN} += "libQt6QmlCore.so.6 \
libQt6QmlCore6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libstdc++.so.6 \
qt6-declarative-imports"

inherit rpm
