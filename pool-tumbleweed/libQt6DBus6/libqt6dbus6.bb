SUMMARY = "Qt6 D-Bus library"
DESCRIPTION = "The Qt D-Bus module is a library that can be used to perform \
inter-process communication using the D-Bus protocol."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "libQt6DBus6-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "48e617b26019c5ded043375512fca8c4f4fb0935d5910fa40d87b37eca81fbc07700be6636825bc5541f6e3d6af2b7cbafc398a7a4fbdf356315627173e8bdca"

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
