SUMMARY = "Terminfo action checker"
DESCRIPTION = "This package contains the tack utility to help to build a new terminfo \
entry describing an unknown terminal. It can also be used to test the \
correctness of an existing entry, and to develop the correct pad \
timings needed to ensure that screen updates do not fall behind the \
incoming data stream."
LICENSE = "GPL-2.0-or-later"

PV = "1.09.20221229"

RPM_NAME = "tack-1.09.20221229-13.1.aarch64.rpm"
RPM_HASH = "11c68fdb1ba5eabb866693a245cb41e93f951ef94803fcc65a37ab14628f8a54a15ac9472ad0fb7b86dbbe5e3574f240bd85e81e6264057300f4ed23372f346b"

RPROVIDES:${PN} += "ncurses-devel:/usr/bin/tack \
tack \
tack(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libtinfo.so.6()(64bit) \
ncurses"

inherit rpm
