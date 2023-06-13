SUMMARY = "Examples for the qt6-serialport modules"
DESCRIPTION = "Examples for the qt6-serialport modules."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-serialport-examples-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "85f87d6d8969bb616fb663d329019cfc71f3408ccc2e4225f0b0982d8fe943854fe621a32064dd717598cc13d63fd73d09080233bd11c9e2362094f8647de9df"

RPROVIDES:${PN} += "qt6-serialport-examples \
qt6-serialport-examples(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Gui.so.6()(64bit) \
libQt6Gui.so.6(Qt_6)(64bit) \
libQt6SerialPort.so.6()(64bit) \
libQt6SerialPort.so.6(Qt_6)(64bit) \
libQt6Widgets.so.6()(64bit) \
libQt6Widgets.so.6(Qt_6)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
