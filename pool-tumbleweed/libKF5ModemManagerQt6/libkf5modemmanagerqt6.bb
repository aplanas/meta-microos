SUMMARY = "Qt wrapper around the ModemManager libraries"
DESCRIPTION = "Qt5 wrapper for ModemManager DBus API."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "5.108.0"

RPM_NAME = "libKF5ModemManagerQt6-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "a2ee38a9a81fec05b20892476d6cd021f17486d2ef2260700e5db01b38eb13e83a91e888018e94bb3372381875eca558f0f74305a34e23804664e0cd70676ccc"

RPROVIDES:${PN} += "libKF5ModemManagerQt.so.6 \
libKF5ModemManagerQt6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
