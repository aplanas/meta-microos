SUMMARY = "Qt wrapper around the ModemManager libraries"
DESCRIPTION = "Qt5 wrapper for ModemManager DBus API."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "5.107.0"

RPM_NAME = "libKF5ModemManagerQt6-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "8ea3aec0f450875015370ec0c36907da3f16dd27c7c5d8d1b95efc10d0896842866e569fef0f8bf326a40d99f4546e0101fa5d7a1aadabf3e7eae050ee62660d"

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
