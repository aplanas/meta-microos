SUMMARY = "Development Files and Documentation for the FOX GUI Toolkit 1.6"
DESCRIPTION = "FOX is a C++-based library for graphical user interface development. \
 \
The devel package contains the files necessary to develop applications \
using the FOX GUI toolkit: the header files, the reswrap resource \
compiler, and manual pages."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.57"

RPM_NAME = "fox16-devel-1.6.57-2.1.aarch64.rpm"
RPM_HASH = "7bc886c2a7b4a6702d9aa498d5c9ecc441203f411bf4c1c0294c8d5df1b750f3ebbf9b5f5e2d566c5047ba478618fd3b7fc2966bb086109a8d6c16e3221f823b"

RPROVIDES:${PN} += "fox-devel fox16-devel fox16-devel(aarch-64) pkgconfig(fox)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/pkg-config bzip2 cups-devel cups-libs expat fontconfig-devel freetype2-devel glibc-devel libFOX-1_6-0 libbz2-devel libc.so.6(GLIBC_2.34)(64bit) libexpat-devel libjpeg-devel libpng-devel libtiff-devel pkgconfig(glu) xorg-x11-Mesa-devel xorg-x11-devel xorg-x11-libX11-devel xorg-x11-libXau-devel xorg-x11-libXdmcp-devel xorg-x11-libXext-devel xorg-x11-libXfixes-devel xorg-x11-libXrender-devel zlib-devel"

inherit rpm
