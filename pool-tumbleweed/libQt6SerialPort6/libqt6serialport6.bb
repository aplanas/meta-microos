SUMMARY = "Qt 6 SerialPort library"
DESCRIPTION = "The Qt SerialPort library provides the basic functionality, which includes \
configuring, I/O operations, getting and setting the control signals \
of the RS-232 pinouts. This module does not support terminal features \
(echo, CR/LF control, text mode, timeouts/delays, or poinout signal \
change notification)."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "libQt6SerialPort6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "1e2d313504f55b9975c077a4bc37892544b566f6aa4c4c163825aeb16fafa5f0e2c675e46e45ee54460a926be8188f1773fdb80c15ecf9bc64d7a432c9e449b1"

RPROVIDES:${PN} += "libQt6SerialPort.so.6 \
libQt6SerialPort6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libc.so.6 \
libstdc++.so.6 \
libudev.so.1"

inherit rpm
