SUMMARY = "Tools using the new curses libraries"
DESCRIPTION = "The ncurses based test programs, that is a set of tools \
showing the features of the new curses libraries."
LICENSE = "MIT"

PV = "6.4.20230819"

RPM_NAME = "ncurses-examples-6.4.20230819-19.1.aarch64.rpm"
RPM_HASH = "5a80e5e683d17de571000290ba88fc828d96947dc9b2b220311c07234b88cb326449250b0e0689d7d49532d626b725c60586e9f6dc98353ce4f77e0cc66c0767"

RPROVIDES:${PN} += "ncurses-examples \
ncurses-tests"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libformw.so.6 \
libm.so.6 \
libmenuw.so.6 \
libncursesw.so.6 \
libpanelw.so.6 \
libtinfo.so.6 \
ncurses-utils"

inherit rpm
