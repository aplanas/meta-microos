SUMMARY = "Terminfo action checker"
DESCRIPTION = "This package contains the tack utility to help to build a new terminfo \
entry describing an unknown terminal. It can also be used to test the \
correctness of an existing entry, and to develop the correct pad \
timings needed to ensure that screen updates do not fall behind the \
incoming data stream."
LICENSE = "GPL-2.0-or-later"

PV = "1.09.20221229"

RPM_NAME = "tack-1.09.20221229-15.1.aarch64.rpm"
RPM_HASH = "5309e10bd146d00c76cc451a1dc37a4853bd030dce64d62ea4e921c42a2d03e4fd824ce117bf53fea6d84164e7dccd39f704bc25a979d855a054cdae61e5ae2b"

RPROVIDES:${PN} += "ncurses-devel-/usr/bin/tack \
tack"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtinfo.so.6 \
ncurses"

inherit rpm
