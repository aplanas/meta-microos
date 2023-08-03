SUMMARY = "Examples for the qt6-serialport modules"
DESCRIPTION = "Examples for the qt6-serialport modules."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-serialport-examples-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "2bffec3231b46d60be13483437d69ccb7001f88fec9859ffe951f6d0258ce0949f93ce5823b1d54f0190527216df28396e27d61abe9ade4fd1f74de571439002"

RPROVIDES:${PN} += "qt6-serialport-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6SerialPort.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
