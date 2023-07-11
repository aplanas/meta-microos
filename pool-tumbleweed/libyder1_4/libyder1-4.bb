SUMMARY = "Logging library written in C"
DESCRIPTION = "Yder is a logging library where messages can be logged to console, \
files, syslog or journald. \
 \
Yder is single-threaded, which means that only one instance of yder \
logging can be used at the same time in a program."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4.19"

RPM_NAME = "libyder1_4-1.4.19-1.4.aarch64.rpm"
RPM_HASH = "59e5455f6bed90672b0a661ffd180e0273ff720a0b633f493d3c85adbea4f7dbc8608ca096d98ce1e2d024336dc9c947aadccdbf15c5b4fd1295a70f791c3fd2"

RPROVIDES:${PN} += "libyder.so.1.4 \
libyder1-4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
liborcania.so.2.3 \
libsystemd.so.0"

inherit rpm
