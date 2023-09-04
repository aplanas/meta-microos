SUMMARY = "Terminfo action checker"
DESCRIPTION = "This package contains the tack utility to help to build a new terminfo \
entry describing an unknown terminal. It can also be used to test the \
correctness of an existing entry, and to develop the correct pad \
timings needed to ensure that screen updates do not fall behind the \
incoming data stream."
LICENSE = "GPL-2.0-or-later"

PV = "1.09.20221229"

RPM_NAME = "tack-1.09.20221229-18.1.aarch64.rpm"
RPM_HASH = "c0b147cff49336f6ebfc90e1669d944cdd5034b3fcc5f968ab4918e63174747fab509a7df7bee15f42882b28303d5adc99ac084a225e763a602c2534da70c8e4"

RPROVIDES:${PN} += "ncurses-devel-/usr/bin/tack \
tack"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtinfo.so.6 \
ncurses"

inherit rpm
