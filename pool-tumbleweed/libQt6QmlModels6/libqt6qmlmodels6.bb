SUMMARY = "Qt 6 QmlModels library"
DESCRIPTION = "The Qt 6 QmlModels library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6QmlModels6-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "794280a06a49112fbb7a5a668732cced09f3773fa03acb9f92c03c438b7bf2d02f7f92d94ef2edd4bac618fd9a4bbea13e41821ffb70e699971ec9dcce015994"

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
