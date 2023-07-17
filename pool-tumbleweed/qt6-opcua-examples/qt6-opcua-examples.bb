SUMMARY = "Examples for the qt6-opcua modules"
DESCRIPTION = "Examples for the qt6-opcua modules."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-opcua-examples-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "e04aa917f0bf98d9088c8679b977ccf3b80ddb19de6aa3fed968400e39270241b91d90e18bf7694c63e1a9e607d48bd24ecf26d8fe98b307136880701f66874c"

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
