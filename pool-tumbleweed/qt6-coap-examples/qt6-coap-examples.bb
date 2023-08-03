SUMMARY = "Examples for the qt6-coap modules"
DESCRIPTION = "Examples for the qt6-coap modules."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-coap-examples-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "873ee68c8c50692fcf1988cf62bc6b5d5c34d7dd02407fc62fe276a7cac4e702a424934e31bb48a9ef4ed891a2047ba39eab1d047b31c48d5b670bb5d7035154"

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
