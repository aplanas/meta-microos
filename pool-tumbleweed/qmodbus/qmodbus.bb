SUMMARY = "QT ModBus tools"
DESCRIPTION = "QModBus is an implementation of a ModBus master application. \
A graphical user interface allows easy communication with ModBus \
slaves over serial line interface. QModBus also includes a bus \
monitor for sniffing all traffic on the bus."
LICENSE = "GPL-2.0-or-later"

PV = "0.3.0"

RPM_NAME = "qmodbus-0.3.0-1.13.aarch64.rpm"
RPM_HASH = "bdba327305629e636731da7f508072b3c14d1398c7d509d1c19eabde7278981347b446c66223e37a2c402053da0d1c40e91e870386eadfe86593db082175fd0a"

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
