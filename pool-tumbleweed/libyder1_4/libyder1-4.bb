SUMMARY = "Logging library written in C"
DESCRIPTION = "Yder is a logging library where messages can be logged to console, \
files, syslog or journald. \
 \
Yder is single-threaded, which means that only one instance of yder \
logging can be used at the same time in a program."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4.19"

RPM_NAME = "libyder1_4-1.4.19-1.3.aarch64.rpm"
RPM_HASH = "f5650bc070c68fe7e6aca808265d53560f51b8414b71541a960204b39dcf136db6fa4ec731acabe70d391e87f9a972aadc553d8377e65941a20a1c42ad57ff70"

RPROVIDES:${PN} += "libyder.so.1.4()(64bit) \
libyder1_4 \
libyder1_4(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
liborcania.so.2.3()(64bit) \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_209)(64bit)"

inherit rpm
