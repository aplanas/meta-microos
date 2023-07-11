SUMMARY = "Examples for the qt6-virtualkeyboard modules"
DESCRIPTION = "Examples for the qt6-virtualkeyboard modules."
LICENSE = "GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-virtualkeyboard-examples-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "7863a51786bd2d2a3049da018c0c2ebccaaabe55d520e2e0002fbd37cedbcde4377d6ed8e71512b7130bf00d38fc2d1c1157aa9369f8caebfd43fee9057d6843"

RPROVIDES:${PN} += "qt6-virtualkeyboard-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Quick.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
