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

RPM_NAME = "libevtlog-4_3-0-4.3.1-1.1.aarch64.rpm"
RPM_HASH = "3f33b6d12a44438a66801562e1f56c9d613d90247c6edd6f98e4e9cf8ba660fd4f1f079aa405262a36cb53cbc92fde5efecfa4a7143e82aa72d2eebdc4635e8a"

RPROVIDES:${PN} += "libevtlog-4-3-0 \
libevtlog-4.3.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
