SUMMARY = "Qt6 D-Bus library"
DESCRIPTION = "The Qt D-Bus module is a library that can be used to perform \
inter-process communication using the D-Bus protocol."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "libQt6DBus6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "2d7cca3796ecfa16e503e662cc2811fe928950587e1dd5b089065ca9d86b2a98ca1bad1a3949b0eb792a498135957a016bdbf757a716a40ac976b626964d051e"

RPROVIDES:${PN} += "libQt6DBus.so.6 \
libQt6DBus6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Core6 \
libc.so.6 \
libdbus-1.so.3 \
libstdc++.so.6"

inherit rpm
