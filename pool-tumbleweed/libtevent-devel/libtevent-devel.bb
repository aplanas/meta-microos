SUMMARY = "Libraries and Header Files to Develop Programs with tevent0 Support"
DESCRIPTION = "Tevent is an event system based on the talloc memory management library. It \
is the core event system used in Samba. \
 \
The low level tevent has support for many event types, including timers, \
signals, and the classic file descriptor events. \
 \
Tevent also provide helpers to deal with asynchronous code providing the \
tevent_req (tevent request) functions. \
 \
This package contains libraries and header files need for development."
LICENSE = "LGPL-3.0-or-later"

PV = "0.14.1"

RPM_NAME = "libtevent-devel-0.14.1-2.2.aarch64.rpm"
RPM_HASH = "14a34f104280e85f973de375994a4289ae8f13fee3106e678ce8eb249b6ab6e9e8175132cde9efd93b735876307222779bbe6ce6ffde5ebe3a628b2dcb7c9b21"

RPROVIDES:${PN} += "libtevent-devel \
pkgconfig-tevent"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libtalloc-devel \
libtevent0 \
pkg-config \
pkgconfig-talloc"

inherit rpm
