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

PV = "4.3.1"

RPM_NAME = "libevtlog-4_3-0-4.3.1-1.2.aarch64.rpm"
RPM_HASH = "82d427f265ad3b75928b499ad5a447db759374a041fe7c2ed13261a602682c370a64a12bd85151fd4acd08786b821d2fd9a1c46b0f57c289b5c49e8ce3b9bf99"

RPROVIDES:${PN} += "libevtlog-4-3-0 \
libevtlog-4.3.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
