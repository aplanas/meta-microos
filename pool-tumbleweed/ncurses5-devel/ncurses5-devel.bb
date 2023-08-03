SUMMARY = "Development files for the ncurses5 terminal control library"
DESCRIPTION = "This package contains the headers needed to build against \
the ncurses library in its ABI version 5 form."
LICENSE = "MIT"

PV = "6.4.20230715"

RPM_NAME = "ncurses5-devel-6.4.20230715-17.1.aarch64.rpm"
RPM_HASH = "152ead76892eaa1c76e17d24a5b06606c24d4d87d67481d1b08069fd0407216435fa9a765c89c9d1e6a39306038a120167e78627f814c0c0f4dfb2fe490c6966"

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
