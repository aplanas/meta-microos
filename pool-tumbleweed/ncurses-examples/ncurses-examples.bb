SUMMARY = "Tools using the new curses libraries"
DESCRIPTION = "The ncurses based test programs, that is a set of tools \
showing the features of the new curses libraries."
LICENSE = "MIT"

PV = "6.4.20230715"

RPM_NAME = "ncurses-examples-6.4.20230715-17.1.aarch64.rpm"
RPM_HASH = "30728be68af23e7166e9794d574aca848f0b3d6f7d0092deca4f2ddc5aaf52f070e13508ca38bec70445fe5a836c90adb39c55d58afcf36cb1621ee496eefeae"

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
