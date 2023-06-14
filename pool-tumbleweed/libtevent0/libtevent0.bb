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

RPM_NAME = "libtevent0-0.14.1-2.1.aarch64.rpm"
RPM_HASH = "daf872aca6273ec683effa70126f4b451dc4958ca7d4e11ec1180327a6bf3702ab020a7036969fa34de652769402fa43b508b58806e8e2bead33f4b8fd33168c"

RPROVIDES:${PN} += "libtevent.so.0 \
libtevent0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libtalloc.so.2"

inherit rpm
