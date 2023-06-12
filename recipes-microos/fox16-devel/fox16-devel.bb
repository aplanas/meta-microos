SUMMARY = "Development Files and Documentation for the FOX GUI Toolkit 1.6"
DESCRIPTION = "FOX is a C++-based library for graphical user interface development. \
 \
The devel package contains the files necessary to develop applications \
using the FOX GUI toolkit: the header files, the reswrap resource \
compiler, and manual pages."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.57"

RPM_NAME = "fox16-devel-1.6.57-4.1.aarch64.rpm"
RPM_HASH = "22d02991e96649eb247bb0fc26e3f2dbf4e166e3c9cb9b89f0579742981b15f8938f79c33265215934f5ea0c2cd98f9385d6c683acc82810607d6c0118d77d72"

RPROVIDES:${PN} += "fox-devel fox16-devel fox16-devel(aarch-64) pkgconfig(fox)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/pkg-config bzip2 cups-devel cups-libs expat glibc-devel libFOX-1_6-0 libbz2-devel libc.so.6(GLIBC_2.34)(64bit) libexpat-devel libjpeg-devel libpng-devel libtiff-devel pkgconfig(fontconfig) pkgconfig(freetype2) pkgconfig(gl) pkgconfig(glu) pkgconfig(x11) pkgconfig(xcursor) pkgconfig(xext) pkgconfig(xft) pkgconfig(xi) pkgconfig(xproto) pkgconfig(xrandr) pkgconfig(xrender) zlib-devel"

inherit rpm
