SUMMARY = "Qt 6 bluetooth library"
DESCRIPTION = "Provides access to Bluetooth hardware."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6Bluetooth6-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "d4ee612fbf3bdd1bcd8a5260370cd9fb53449ce445d90edd42006c87aa21f3907a2a46fd219e4a32fe75c3a794f035a6eac230ed4aece7d2fe9db4c3d0cb829c"

RPROVIDES:${PN} += "libQt6Bluetooth.so.6 \
libQt6Bluetooth6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Network.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
