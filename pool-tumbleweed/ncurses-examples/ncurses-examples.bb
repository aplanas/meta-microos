SUMMARY = "Tools using the new curses libraries"
DESCRIPTION = "The ncurses based test programs, that is a set of tools \
showing the features of the new curses libraries."
LICENSE = "MIT"

PV = "6.4.20230812"

RPM_NAME = "ncurses-examples-6.4.20230812-18.1.aarch64.rpm"
RPM_HASH = "6c3ad9f3c8f5bfc1b92f3c9769f0aa82f0038f8a27d511aa40a17bde40ff5e34652583418aa7648ac7e7045cc1f52cf7d98fa4d5f717bf83cb8878345c86bc0c"

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
