SUMMARY = "Development Files and Documentation for the FOX GUI Toolkit 1.6"
DESCRIPTION = "FOX is a C++-based library for graphical user interface development. \
 \
The devel package contains the files necessary to develop applications \
using the FOX GUI toolkit: the header files, the reswrap resource \
compiler, and manual pages."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.57"

RPM_NAME = "fox16-devel-1.6.57-4.2.aarch64.rpm"
RPM_HASH = "c368e4fdd9d797f2552d4f87ff359081aff691b493af7c011a6c49b6d01878b8bf4994a2eb724b39f39e78807a2f0bd66585c86a28e13027e5774f41874a1b88"

RPROVIDES:${PN} += "fox-devel \
fox16-devel \
pkgconfig-fox"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
bzip2 \
cups-devel \
cups-libs \
expat \
glibc-devel \
libFOX-1-6-0 \
libbz2-devel \
libc.so.6 \
libexpat-devel \
libjpeg-devel \
libpng-devel \
libtiff-devel \
pkgconfig-fontconfig \
pkgconfig-freetype2 \
pkgconfig-gl \
pkgconfig-glu \
pkgconfig-x11 \
pkgconfig-xcursor \
pkgconfig-xext \
pkgconfig-xft \
pkgconfig-xi \
pkgconfig-xproto \
pkgconfig-xrandr \
pkgconfig-xrender \
zlib-devel"

inherit rpm
