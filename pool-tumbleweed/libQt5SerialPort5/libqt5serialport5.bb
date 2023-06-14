SUMMARY = "Qt 5 Serial Port Addon"
DESCRIPTION = "Qt Serial Port provides the basic functionality, which includes \
configuring, I/O operations, getting and setting the control signals \
of the RS-232 pinouts. This module does not support terminal features \
(echo, CR/LF control, text mode, timeouts/delays, or poinout signal \
change notification)."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde0"

RPM_NAME = "libQt5SerialPort5-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "723833f87ba1cfa7a262fc188212023a36ab49c4f44615c8c6ebcf00daf985a1ac75f421924ebac7c713ab73fc51d40ffd1fb5a93c09534dbd37edc7595ddec2"

RPROVIDES:${PN} += "libQt5SerialPort.so.5 \
libQt5SerialPort5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Core5 \
libc.so.6 \
libstdc++.so.6 \
libudev.so.1"

inherit rpm
