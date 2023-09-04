SUMMARY = "Development files for the ncurses6 terminal control library"
DESCRIPTION = "This package contains the headers needed to build against \
the ncurses library in its ABI version 6 form."
LICENSE = "MIT"

PV = "6.4.20230812"

RPM_NAME = "ncurses-devel-6.4.20230812-18.1.aarch64.rpm"
RPM_HASH = "8641999145eb3399f0e030df12b365e47ec92b8e83965c20ae5c527b89947179392bed8f4498c18fcaab7666f262c2558a254f6a0f22b24a883222b416159cde"

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
