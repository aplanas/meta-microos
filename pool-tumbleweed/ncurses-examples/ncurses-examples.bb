SUMMARY = "Tools using the new curses libraries"
DESCRIPTION = "The ncurses based test programs, that is a set of tools \
showing the features of the new curses libraries."
LICENSE = "MIT"

PV = "6.4.20230701"

RPM_NAME = "ncurses-examples-6.4.20230701-16.1.aarch64.rpm"
RPM_HASH = "37a27a1652c81c51483ea0aea27d8e38c1665b53c4cad19237c61da740a4b60dd5ad67294f9ad302d196324b9a6ff3e81f6082259a325d5b07206246f5076c90"

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
