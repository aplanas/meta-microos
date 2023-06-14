SUMMARY = "Examples for the qt6-connectivity modules"
DESCRIPTION = "Examples for the qt6-connectivity modules."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-connectivity-examples-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "b403aae9f68096ced9dbb9c35d12fb035a676365792367f9540a3e9ed9d04f89fa950e8ac66d690c0d189ebb275b7b25ad1ba0d5d49d0958b03f6ff386299926"

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
