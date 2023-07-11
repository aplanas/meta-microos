SUMMARY = "Tools using the new curses libraries"
DESCRIPTION = "The ncurses based test programs, that is a set of tools \
showing the features of the new curses libraries."
LICENSE = "MIT"

PV = "6.4.20230617"

RPM_NAME = "ncurses-examples-6.4.20230617-15.1.aarch64.rpm"
RPM_HASH = "59520c1541600959337f9b8e0a81e823459c5b80ad3b8c5a99d43c635acceec1dc37ca480d7f1f2144fc4e3858bbe70ea3075d9d4ae515b2e893033fd410be47"

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
