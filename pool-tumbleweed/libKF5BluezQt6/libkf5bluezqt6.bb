SUMMARY = "Async Bluez wrapper library - development files"
DESCRIPTION = "Async Bluez wrapper library."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "libKF5BluezQt6-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "21090c4cd68946ceea8a205e4505f14dcb39cbfb0b6fb19a3763b66f3e047c841e7a02b34f273680f18d937c76a56feff46665a6eec973d0d2a023779f1a73b1"

RPROVIDES:${PN} += "libKF5BluezQt.so.6 \
libKF5BluezQt6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Network.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
