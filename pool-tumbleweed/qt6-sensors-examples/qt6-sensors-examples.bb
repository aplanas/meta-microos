SUMMARY = "Examples for the qt6-sensors modules"
DESCRIPTION = "Examples for the qt6-sensors modules."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-sensors-examples-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "8de98936bacdde8ec4c8868e1607e5b062e34c4c39f890c704e7c1f11ac5e0c537a2ae00feb5b3b99e46533261b68e40996226af7e4b6deec2710a5776d7e6bf"

RPROVIDES:${PN} += "qt6-sensors-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
