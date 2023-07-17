SUMMARY = "Terminfo action checker"
DESCRIPTION = "This package contains the tack utility to help to build a new terminfo \
entry describing an unknown terminal. It can also be used to test the \
correctness of an existing entry, and to develop the correct pad \
timings needed to ensure that screen updates do not fall behind the \
incoming data stream."
LICENSE = "GPL-2.0-or-later"

PV = "1.09.20221229"

RPM_NAME = "tack-1.09.20221229-16.1.aarch64.rpm"
RPM_HASH = "b7bed9af64258bbc9ffbd185232876927ed56df556c802136ba0ccfe2c2e95f64f29994a17de1611b3fdb13146e6dc91112dbac9e10d74394d82732849e7963f"

RPROVIDES:${PN} += "ncurses-devel-/usr/bin/tack \
tack"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtinfo.so.6 \
ncurses"

inherit rpm
