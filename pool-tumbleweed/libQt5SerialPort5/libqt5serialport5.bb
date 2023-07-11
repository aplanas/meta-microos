SUMMARY = "Qt 5 Serial Port Addon"
DESCRIPTION = "Qt Serial Port provides the basic functionality, which includes \
configuring, I/O operations, getting and setting the control signals \
of the RS-232 pinouts. This module does not support terminal features \
(echo, CR/LF control, text mode, timeouts/delays, or poinout signal \
change notification)."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.10+kde0"

RPM_NAME = "libQt5SerialPort5-5.15.10+kde0-1.1.aarch64.rpm"
RPM_HASH = "5f287ed29b2c0ec6724f3c9ec36bf09dfbfef72e71286af0df0251501cdff02d72e1837bd3189f22734447465cc70498a43a02c4eb53381603527193988cfb29"

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
