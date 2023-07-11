SUMMARY = "Samba tevent Library"
DESCRIPTION = "Tevent is an event system based on the talloc memory management library. It \
is the core event system used in Samba. \
 \
The low level tevent has support for many event types, including timers, \
signals, and the classic file descriptor events. \
 \
This package contains the tevent0 library."
LICENSE = "LGPL-3.0-or-later"

PV = "0.14.1"

RPM_NAME = "libtevent0-0.14.1-2.2.aarch64.rpm"
RPM_HASH = "b2d024657276c08a3ae76c62abc6b69aa576a77ce1173247d3fa01def0545ebd464154f67bf92973a3390b76288dfae633a53eb0f1d738b9c7db929ac7f8cd4c"

RPROVIDES:${PN} += "libtevent.so.0 \
libtevent0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libtalloc.so.2"

inherit rpm
