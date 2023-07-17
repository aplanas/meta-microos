SUMMARY = "Examples for the qt6-connectivity modules"
DESCRIPTION = "Examples for the qt6-connectivity modules."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-connectivity-examples-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "5188fdb06ca84127ea3817f08c7040bbec9bceb39c18464b6ff6136426b8926fb552ff503f9b07aea803dc1e3b1865351c0bfe621076f598e4ac8b0b0db900c7"

RPROVIDES:${PN} += "qt6-connectivity-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Bluetooth.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Nfc.so.6 \
libQt6Qml.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
