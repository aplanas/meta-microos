SUMMARY = "Tools using the new curses libraries"
DESCRIPTION = "The ncurses based test programs, that is a set of tools \
showing the features of the new curses libraries."
LICENSE = "MIT"

PV = "6.4.20230520"

RPM_NAME = "ncurses-examples-6.4.20230520-13.1.aarch64.rpm"
RPM_HASH = "687a0559f457e511d71aab2724cf5e48724bff94680cc7e9b828f641967453fd34e181ed07f8f751fb26dec18c6e6016a88c7a078969c48cf1581005ce61ac3a"

RPROVIDES:${PN} += "ncurses-examples \
ncurses-tests"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/bash \
/usr/bin/perl \
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
