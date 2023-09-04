SUMMARY = "Development files for the ncurses5 terminal control library"
DESCRIPTION = "This package contains the headers needed to build against \
the ncurses library in its ABI version 5 form."
LICENSE = "MIT"

PV = "6.4.20230812"

RPM_NAME = "ncurses5-devel-6.4.20230812-18.1.aarch64.rpm"
RPM_HASH = "67a68949c758659cf3dc7ee4754038280284a36c1b257a0bd3de496c4892e65a0b0afd9312a59aac4b638f2de86c176f5ca05678f5d7cfa74200a64df5513cdc"

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
