SUMMARY = "Syslog-ng event logger library runtime"
DESCRIPTION = "The EventLog library provides an alternative to the simple syslog() \
API provided on UNIX systems. Compared to syslog, EventLog adds \
structured messages. \
 \
EventLog provides an interface to build, format and output an event \
record. The exact format and output method can be customized by the \
administrator via a configuration file. \
 \
This package is now merged into syslog-ng."
LICENSE = "GPL-2.0-only"

PV = "4.2.0"

RPM_NAME = "libevtlog-4_2-0-4.2.0-1.1.aarch64.rpm"
RPM_HASH = "2683546c774239e2c3d657273918714b320f6968dc59d6e3b2dc3ea061ac16e9e59f2b19c90e1d01fa6046136de29e51464e62b00c67db546622618b0c4808e0"

RPROVIDES:${PN} += "libevtlog-4.2.so.0()(64bit) \
libevtlog-4_2-0 \
libevtlog-4_2-0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
