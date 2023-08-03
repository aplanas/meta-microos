SUMMARY = "Examples for the qt6-websockets modules"
DESCRIPTION = "Examples for the qt6-websockets modules."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-websockets-examples-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "362655bff9df6063929c437db76d2fb9374a2d055902e859472d7a143ff3801ddab7860f9039c25c1f545d1c80c4dce24e7a62bd718bd6d83e7aaf012a00609f"

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
