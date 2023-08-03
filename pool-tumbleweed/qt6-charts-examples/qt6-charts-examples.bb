SUMMARY = "Examples for the qt6-charts modules"
DESCRIPTION = "Examples for the qt6-charts modules."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-charts-examples-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "1905c6a59926a273a56409a35a89ee5d16b1af4d8b739f7eefbbd44531a7502e1f9bc1767e147d9a60b233427573ccdd58d958e1c41f98e5e88e22bb86af36a0"

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
