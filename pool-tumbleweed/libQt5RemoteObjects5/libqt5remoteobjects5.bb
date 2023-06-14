SUMMARY = "Qt 5 RemoteObjects Library"
DESCRIPTION = "Qt Remote Objects (QtRO) is an inter-process communication (IPC) \
processes or computers."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde0"

RPM_NAME = "libQt5RemoteObjects5-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "692808e9d57ae2b25096845ad1aab2503f2e5e96ecb135c674dcb28e7458e9be7a5b9180e404749ee55e9c3c326a62c4d65468e090b5e2d5a75255c6096bc4bb"

RPROVIDES:${PN} += "libQt5RemoteObjects.so.5 \
libQt5RemoteObjects5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Core5 \
libQt5Network.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
