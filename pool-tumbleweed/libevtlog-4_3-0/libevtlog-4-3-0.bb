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

RPM_NAME = "libevtlog-4_3-0-4.3.1-1.3.aarch64.rpm"
RPM_HASH = "9ff50b6e9a9dfd38a1c7a8ed306f24d8f146d233dd820e65593ed89aed4e5f955136000361b6e72ba60ce04e580383031a7946e58cfb5b693705d89c962f3706"

RPROVIDES:${PN} += "libevtlog-4-3-0 \
libevtlog-4.3.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
