SUMMARY = "Examples for the qt6-quick3d modules"
DESCRIPTION = "Examples for the qt6-quick3d modules."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-quick3d-examples-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "03fb90f42ab833cc7415c03e0456f299ed6023926b55ec779be192a1e9f76635ceb08d4b94a1993674c82c01e1bdacd2160eee63589ddfda9f60fb2f4e9c1f40"

RPROVIDES:${PN} += "qt6-quick3d-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6Quick3D.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
