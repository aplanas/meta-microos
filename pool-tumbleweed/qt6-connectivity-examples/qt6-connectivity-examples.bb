SUMMARY = "Examples for the qt6-connectivity modules"
DESCRIPTION = "Examples for the qt6-connectivity modules."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-connectivity-examples-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "96c909cc7533ab50d29501978fb1276400832cf44edc7ee1574466d61dd5fe7b8a06589ebba25173d0ce4ac28da717b669588110bc78a0198e82cdef6663356d"

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
