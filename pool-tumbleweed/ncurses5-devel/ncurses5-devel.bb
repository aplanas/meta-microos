SUMMARY = "Development files for the ncurses5 terminal control library"
DESCRIPTION = "This package contains the headers needed to build against \
the ncurses library in its ABI version 5 form."
LICENSE = "MIT"

PV = "6.4.20230617"

RPM_NAME = "ncurses5-devel-6.4.20230617-15.1.aarch64.rpm"
RPM_HASH = "ca4e38172b3b17e50ec73a30b347af7a006e188783dda3ab10cf0f99777f8049ec4993c92ae3cc3d31a186ef48f32dea70d92d52b2f8a39a234dd5fc9cd70fc4"

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
