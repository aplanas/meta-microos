SUMMARY = "Development files for the ncurses6 terminal control library"
DESCRIPTION = "This package contains the headers needed to build against \
the ncurses library in its ABI version 6 form."
LICENSE = "MIT"

PV = "6.4.20230617"

RPM_NAME = "ncurses-devel-6.4.20230617-15.1.aarch64.rpm"
RPM_HASH = "be314dcda81dd20df3b9336d932d2b3ba5a04c90944ab4b7ac11df314436153ef1d8d4b0362bf2768fc7a2c2befce2713c29a82638c1ac4465bbf801c4a7dddd"

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
