SUMMARY = "Tools using the new curses libraries"
DESCRIPTION = "The ncurses based test programs, that is a set of tools \
showing the features of the new curses libraries."
LICENSE = "MIT"

PV = "6.4.20230520"

RPM_NAME = "ncurses-examples-6.4.20230520-13.1.aarch64.rpm"
RPM_HASH = "687a0559f457e511d71aab2724cf5e48724bff94680cc7e9b828f641967453fd34e181ed07f8f751fb26dec18c6e6016a88c7a078969c48cf1581005ce61ac3a"

RPROVIDES:${PN} += "ncurses-examples \
ncurses-examples(aarch-64) \
ncurses-tests"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/bash \
/usr/bin/perl \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libformw.so.6()(64bit) \
libm.so.6()(64bit) \
libmenuw.so.6()(64bit) \
libncursesw.so.6()(64bit) \
libpanelw.so.6()(64bit) \
libtinfo.so.6()(64bit) \
ncurses-utils"

inherit rpm
