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

RPROVIDES:${PN} += "libtevent.so.0()(64bit) \
libtevent.so.0(TEVENT_0.10.0)(64bit) \
libtevent.so.0(TEVENT_0.10.1)(64bit) \
libtevent.so.0(TEVENT_0.10.2)(64bit) \
libtevent.so.0(TEVENT_0.11.0)(64bit) \
libtevent.so.0(TEVENT_0.12.0)(64bit) \
libtevent.so.0(TEVENT_0.12.1)(64bit) \
libtevent.so.0(TEVENT_0.13.0)(64bit) \
libtevent.so.0(TEVENT_0.14.0)(64bit) \
libtevent.so.0(TEVENT_0.14.1)(64bit) \
libtevent.so.0(TEVENT_0.9.10)(64bit) \
libtevent.so.0(TEVENT_0.9.11)(64bit) \
libtevent.so.0(TEVENT_0.9.12)(64bit) \
libtevent.so.0(TEVENT_0.9.13)(64bit) \
libtevent.so.0(TEVENT_0.9.14)(64bit) \
libtevent.so.0(TEVENT_0.9.15)(64bit) \
libtevent.so.0(TEVENT_0.9.16)(64bit) \
libtevent.so.0(TEVENT_0.9.17)(64bit) \
libtevent.so.0(TEVENT_0.9.18)(64bit) \
libtevent.so.0(TEVENT_0.9.19)(64bit) \
libtevent.so.0(TEVENT_0.9.20)(64bit) \
libtevent.so.0(TEVENT_0.9.21)(64bit) \
libtevent.so.0(TEVENT_0.9.22)(64bit) \
libtevent.so.0(TEVENT_0.9.23)(64bit) \
libtevent.so.0(TEVENT_0.9.24)(64bit) \
libtevent.so.0(TEVENT_0.9.25)(64bit) \
libtevent.so.0(TEVENT_0.9.26)(64bit) \
libtevent.so.0(TEVENT_0.9.27)(64bit) \
libtevent.so.0(TEVENT_0.9.28)(64bit) \
libtevent.so.0(TEVENT_0.9.29)(64bit) \
libtevent.so.0(TEVENT_0.9.30)(64bit) \
libtevent.so.0(TEVENT_0.9.31)(64bit) \
libtevent.so.0(TEVENT_0.9.32)(64bit) \
libtevent.so.0(TEVENT_0.9.33)(64bit) \
libtevent.so.0(TEVENT_0.9.34)(64bit) \
libtevent.so.0(TEVENT_0.9.35)(64bit) \
libtevent.so.0(TEVENT_0.9.36)(64bit) \
libtevent.so.0(TEVENT_0.9.37)(64bit) \
libtevent.so.0(TEVENT_0.9.38)(64bit) \
libtevent.so.0(TEVENT_0.9.39)(64bit) \
libtevent.so.0(TEVENT_0.9.9)(64bit) \
libtevent0 \
libtevent0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libtalloc.so.2()(64bit) \
libtalloc.so.2(TALLOC_2.0.2)(64bit) \
libtalloc.so.2(TALLOC_2.1.0)(64bit)"

inherit rpm
