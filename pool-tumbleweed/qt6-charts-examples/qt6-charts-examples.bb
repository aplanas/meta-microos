SUMMARY = "Examples for the qt6-charts modules"
DESCRIPTION = "Examples for the qt6-charts modules."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-charts-examples-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "7950f9f9df7218405cd3fddfc51e6f304e5d9622c78089195179bdf32d42a5dfcb0b45bc2c1fc86d7fea10fe2deac254e3f7a95e77affd8c22cb30f848b9ffe3"

RPROVIDES:${PN} += "qt6-charts-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Charts.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
