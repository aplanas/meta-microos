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

RPM_NAME = "libevtlog-4_2-0-4.2.0-2.2.aarch64.rpm"
RPM_HASH = "169b62ceaa4e7710a036d7d2db81a831ea98984d34fc9db072660816bc89c775c1320b2a3738b782d9749d011eb3037587ff81ee11242058c59952563d846624"

RPROVIDES:${PN} += "libevtlog-4-2-0 \
libevtlog-4.2.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
