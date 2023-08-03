SUMMARY = "Development files for the ncurses6 terminal control library"
DESCRIPTION = "This package contains the headers needed to build against \
the ncurses library in its ABI version 6 form."
LICENSE = "MIT"

PV = "6.4.20230715"

RPM_NAME = "ncurses-devel-6.4.20230715-17.1.aarch64.rpm"
RPM_HASH = "f1c22abc9a4638286e59ea739639dea4d261142abe8253b2b21d6a65338f075fa58eddea6240373ce0b09daad8a625e00eed3c5ac6c7b7cc0cd97f3dc44f2419"

RPROVIDES:${PN} += "ncurses-/usr/include/ncurses.h \
ncurses-devel \
ncurses6-devel \
pkgconfig-form \
pkgconfig-formw \
pkgconfig-menu \
pkgconfig-menuw \
pkgconfig-ncurses \
pkgconfig-ncurses++ \
pkgconfig-ncurses++w \
pkgconfig-ncursesw \
pkgconfig-panel \
pkgconfig-panelw \
pkgconfig-tic \
pkgconfig-tinfo"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/pkg-config \
/usr/bin/tack \
ld-linux-aarch64.so.1 \
libc.so.6 \
libncurses6 \
libticw.so.6 \
libtinfo.so.6 \
ncurses"

inherit rpm
