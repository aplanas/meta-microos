SUMMARY = "QT ModBus tools"
DESCRIPTION = "QModBus is an implementation of a ModBus master application. \
A graphical user interface allows easy communication with ModBus \
slaves over serial line interface. QModBus also includes a bus \
monitor for sniffing all traffic on the bus."
LICENSE = "GPL-2.0-or-later"

PV = "0.3.0"

RPM_NAME = "qmodbus-0.3.0-1.13.aarch64.rpm"
RPM_HASH = "bdba327305629e636731da7f508072b3c14d1398c7d509d1c19eabde7278981347b446c66223e37a2c402053da0d1c40e91e870386eadfe86593db082175fd0a"

RPROVIDES:${PN} += "application() \
application(QModBus.desktop) \
bundled(QextSerialPort) \
bundled(libmodbus) \
qmodbus \
qmodbus(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
