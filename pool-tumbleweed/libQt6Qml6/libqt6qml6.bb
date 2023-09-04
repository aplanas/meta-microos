SUMMARY = "Qt 6 Qml library"
DESCRIPTION = "The Qt 6 Qml library."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "libQt6Qml6-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "ccacfa878ebc3219f138bce76a5b8566074e13b1157ca9f356a6d934e5bfe3ec79eb209b115e696529e3e2a0e7e7eaebd43af4b5b40b4580079faa429be93b23"

RPROVIDES:${PN} += "libQt6Qml.so.6 \
libQt6Qml6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Network.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
qt6-declarative-imports"

inherit rpm
