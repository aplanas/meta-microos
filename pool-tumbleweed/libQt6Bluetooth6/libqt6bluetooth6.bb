SUMMARY = "Qt 6 bluetooth library"
DESCRIPTION = "Provides access to Bluetooth hardware."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6Bluetooth6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "23bbc62951677ff9d8eecd6cb28b1cc7cc1dc41ea11f12b8662fbf488a2bf8a6abba03d544fd8ab8d0d9536c9d15491c6a723f5dc980e367398e0b4a40a947e3"

RPROVIDES:${PN} += "libQt6Bluetooth.so.6()(64bit) \
libQt6Bluetooth.so.6(Qt_6)(64bit) \
libQt6Bluetooth6 \
libQt6Bluetooth6(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6DBus.so.6()(64bit) \
libQt6DBus.so.6(Qt_6)(64bit) \
libQt6Network.so.6()(64bit) \
libQt6Network.so.6(Qt_6)(64bit) \
libc.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
