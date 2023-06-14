SUMMARY = "Examples for the qt6-websockets modules"
DESCRIPTION = "Examples for the qt6-websockets modules."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-websockets-examples-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "91cf1981d07e2051033cecb5e19289208c940cae35baa6a12f13336156ceea6abc7b85b0effea7c0916de0b91b0ae501ad6e1f55dd3437f3b03bec7e20b4aea8"

RPROVIDES:${PN} += "qt6-websockets-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Quick.so.6 \
libQt6WebSockets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
