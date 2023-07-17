SUMMARY = "Development files for the ncurses6 terminal control library"
DESCRIPTION = "This package contains the headers needed to build against \
the ncurses library in its ABI version 6 form."
LICENSE = "MIT"

PV = "6.4.20230701"

RPM_NAME = "ncurses-devel-6.4.20230701-16.1.aarch64.rpm"
RPM_HASH = "a9fa51478027a9ec9cf2579c6ba72ede330629ec54a733907b86347ad5aeec98727868f12bab9dfda6d12bc38b0e1eb4dc6117a22c99e1e9efb8722bcd5a4d72"

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
