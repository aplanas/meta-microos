SUMMARY = "Examples for the qt6-opcua modules"
DESCRIPTION = "Examples for the qt6-opcua modules."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-opcua-examples-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "9d040a9f50eea518108beb2ad0cb87f13b787559836117a1170d2ee37747dc28775c8a29500c12b39a9f3ac2580f14f7d563d63aa57705e09400027a2f9c0590"

RPROVIDES:${PN} += "qt6-opcua-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6OpcUa.so.6 \
libQt6Qml.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
