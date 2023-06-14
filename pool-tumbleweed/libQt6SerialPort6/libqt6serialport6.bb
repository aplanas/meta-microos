SUMMARY = "Qt 6 SerialPort library"
DESCRIPTION = "The Qt SerialPort library provides the basic functionality, which includes \
configuring, I/O operations, getting and setting the control signals \
of the RS-232 pinouts. This module does not support terminal features \
(echo, CR/LF control, text mode, timeouts/delays, or poinout signal \
change notification)."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6SerialPort6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "65800f78da0ba619ef4942a4b1d542fc334727d075c8f47b07244b8de614bd0432f48b21d0fd1debe0bd11b6d918f5f7dbc8a97f6d7308d73576c03128cf8f43"

RPROVIDES:${PN} += "libQt6SerialPort.so.6 \
libQt6SerialPort6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libc.so.6 \
libstdc++.so.6 \
libudev.so.1"

inherit rpm
