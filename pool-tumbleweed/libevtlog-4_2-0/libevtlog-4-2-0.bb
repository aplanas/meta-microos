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

RPM_NAME = "libevtlog-4_2-0-4.2.0-3.1.aarch64.rpm"
RPM_HASH = "ca6e9949ee6fdbaa6edf1ba39efdacd5aeeb8c52f2ccbd14c5f6a7cfdc7f4c1be636c7e5b4bc4b5153290bb97eea70dc68f500212f3ccbb47d23ad51306f0f74"

RPROVIDES:${PN} += "libevtlog-4-2-0 \
libevtlog-4.2.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
