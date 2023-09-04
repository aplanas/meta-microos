SUMMARY = "Qt 6 QmlModels library"
DESCRIPTION = "The Qt 6 QmlModels library."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "libQt6QmlModels6-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "08dfec608e3eabb9bb5477acf11016ca53b77c391457d68b46261cd994f9275d96584896f41f92f7ee7fbfb5f011f30b3da35fa1846b4828b2e7908822a7950b"

RPROVIDES:${PN} += "libQt6QmlModels.so.6 \
libQt6QmlModels6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
