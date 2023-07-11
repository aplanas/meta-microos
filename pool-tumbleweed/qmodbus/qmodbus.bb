SUMMARY = "QT ModBus tools"
DESCRIPTION = "QModBus is an implementation of a ModBus master application. \
A graphical user interface allows easy communication with ModBus \
slaves over serial line interface. QModBus also includes a bus \
monitor for sniffing all traffic on the bus."
LICENSE = "GPL-2.0-or-later"

PV = "0.3.0"

RPM_NAME = "qmodbus-0.3.0-1.14.aarch64.rpm"
RPM_HASH = "869f7dcf3e95de4e78e43be1e9b976d2852d7cbb08a1de1fac7d54777f5dbb7d1ac23cf07692a3d8af17b1cdd6822209365e2ab20403d4eaa7712d9e7aaec217"

RPROVIDES:${PN} += "bundled-QextSerialPort \
bundled-libmodbus \
qmodbus"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
