SUMMARY = "Development files for the ncurses5 terminal control library"
DESCRIPTION = "This package contains the headers needed to build against \
the ncurses library in its ABI version 5 form."
LICENSE = "MIT"

PV = "6.4.20230701"

RPM_NAME = "ncurses5-devel-6.4.20230701-16.1.aarch64.rpm"
RPM_HASH = "3bd61adac0ca02f7269041cf196f777704c6ee8f64da131ce9e08cf0386c2d29b50b44cbe49e486b86ba3558c5e11b8ff6e70f17058ee8717391252502efaa53"

RPROVIDES:${PN} += "ncurses-/usr/include/ncurses5/ncurses.h \
ncurses5-devel \
pkgconfig-form5 \
pkgconfig-formw5 \
pkgconfig-menu5 \
pkgconfig-menuw5 \
pkgconfig-ncurses++5 \
pkgconfig-ncurses++w5 \
pkgconfig-ncurses5 \
pkgconfig-ncursesw5 \
pkgconfig-panel5 \
pkgconfig-panelw5 \
pkgconfig-tic5 \
pkgconfig-tinfo5"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/pkg-config \
/usr/bin/tack \
libncurses5 \
ncurses \
ncurses-devel"

inherit rpm
