SUMMARY = "Qt wrapper around the ModemManager libraries"
DESCRIPTION = "Qt5 wrapper for ModemManager DBus API."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "5.109.0"

RPM_NAME = "libKF5ModemManagerQt6-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "92d283933420ebcbd064cb8e3ef638c70aec4bd9332751934ae0e62adfbcf517c48b15d22b7d5a1e555215bb538b17cfb39da326ea384ee089a2abfb7973400a"

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
