SUMMARY = "Development files for the ncurses5 terminal control library"
DESCRIPTION = "This package contains the headers needed to build against \
the ncurses library in its ABI version 5 form."
LICENSE = "MIT"

PV = "6.4.20230819"

RPM_NAME = "ncurses5-devel-6.4.20230819-19.1.aarch64.rpm"
RPM_HASH = "de7fd74777f55a515d2bc8341ac18f57c2c4c135e72052117565f7b3714cda145a08fefd7a3ad51e4f0f57acf298903d99750613d9c32b1438908bfe2088b227"

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
