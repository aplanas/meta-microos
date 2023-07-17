SUMMARY = "Examples for the qt6-coap modules"
DESCRIPTION = "Examples for the qt6-coap modules."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-coap-examples-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "4ad6e2579333b6f57ff4aee4d8d8ab5f0e452c013346531bc5d1489fe7fa67b76e14bc20d3ccc549cf963b8537c3fca31ddb886eb0a1606d227093c09070e25f"

RPROVIDES:${PN} += "qt6-coap-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Coap.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Qml.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
