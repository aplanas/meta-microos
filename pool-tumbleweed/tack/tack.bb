SUMMARY = "Terminfo action checker"
DESCRIPTION = "This package contains the tack utility to help to build a new terminfo \
entry describing an unknown terminal. It can also be used to test the \
correctness of an existing entry, and to develop the correct pad \
timings needed to ensure that screen updates do not fall behind the \
incoming data stream."
LICENSE = "GPL-2.0-or-later"

PV = "1.09.20221229"

RPM_NAME = "tack-1.09.20221229-17.1.aarch64.rpm"
RPM_HASH = "479d5736d41c97c905d310cb9f8669853dd4d0d717fc0a16a4162762aceb0617c1d515de7959e17a2501487b1d3b8384c07eef61b7b07e0b5001b615c0130e35"

RPROVIDES:${PN} += "ncurses-devel-/usr/bin/tack \
tack"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtinfo.so.6 \
ncurses"

inherit rpm
