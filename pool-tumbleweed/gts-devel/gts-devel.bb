SUMMARY = "Development files and documentation for GTS"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that use GTS."
LICENSE = "LGPL-2.0+"

PV = "0.7.6_p20121130"

RPM_NAME = "gts-devel-0.7.6_p20121130-4.30.aarch64.rpm"
RPM_HASH = "d2d3e7f1fbf024d9b385ea6516195e6d59033571d5a3e987b89e00095b77773631262299d990b773ef9e4d84b30d099dfe8c810a7268f40f79f4f301c240563d"

RPROVIDES:${PN} += "gts-devel \
pkgconfig-gts"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gcc \
gcc-c++ \
glib2-devel \
gts \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgts-0-7-5 \
libgts-0.7.so.5 \
libnetpbm.so.11 \
pkgconfig-glib-2.0 \
pkgconfig-gmodule-2.0 \
pkgconfig-gthread-2.0"

inherit rpm
