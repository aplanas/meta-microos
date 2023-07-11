SUMMARY = "Qt 5 Bluez Addon"
DESCRIPTION = "Qt is a set of libraries for developing applications."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.10+kde4"

RPM_NAME = "libQt5Bluetooth5-5.15.10+kde4-1.1.aarch64.rpm"
RPM_HASH = "722d102e429a181bd22fd232ecad84a3fec8f3e8207b69dd51c4867d099ed62e3bd8aad34925449c4960cfcc02d343a60ae02023b443cf1eb47dfad59a686f4c"

RPROVIDES:${PN} += "libQt5Bluetooth.so.5 \
libQt5Bluetooth5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5DBus5 \
libQt5Network.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
