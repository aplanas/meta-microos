SUMMARY = "Examples for the qt6-connectivity modules"
DESCRIPTION = "Examples for the qt6-connectivity modules."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-connectivity-examples-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "0a4cc871cdf216922feb7537bd2ee0cc7cfdc22c3cf597dfe8a209f21287851e3e7f5b9de7648b01e8daa17abadd400c1f536e697d4e8cd0d9d070b0a2b1bc79"

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
