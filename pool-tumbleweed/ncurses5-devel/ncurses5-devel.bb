SUMMARY = "Development files for the ncurses5 terminal control library"
DESCRIPTION = "This package contains the headers needed to build against \
the ncurses library in its ABI version 5 form."
LICENSE = "MIT"

PV = "6.4.20230520"

RPM_NAME = "ncurses5-devel-6.4.20230520-13.1.aarch64.rpm"
RPM_HASH = "b6600a43f48754d28f62d5fe3e3fea171e3f4be10b2f122fb47c09b5a42c18342fe6caa135b38a6d2ee75f5920212a79c34df6062210c35c66860f9cc4383879"

RPROVIDES:${PN} += "ncurses5-devel \
ncurses5-devel(aarch-64) \
ncurses:/usr/include/ncurses5/ncurses.h \
pkgconfig(form5) \
pkgconfig(formw5) \
pkgconfig(menu5) \
pkgconfig(menuw5) \
pkgconfig(ncurses++5) \
pkgconfig(ncurses++w5) \
pkgconfig(ncurses5) \
pkgconfig(ncursesw5) \
pkgconfig(panel5) \
pkgconfig(panelw5) \
pkgconfig(tic5) \
pkgconfig(tinfo5)"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/pkg-config \
/usr/bin/tack \
libncurses5 \
ncurses \
ncurses-devel"

inherit rpm
