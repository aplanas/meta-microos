SUMMARY = "Frequency tables and some Tools for motv and xawtv"
DESCRIPTION = "This package includes frequency tables for various countries and some utilities \
for xawtv and motv (xawtv-remote, for example)."
LICENSE = "GPL-2.0-or-later"

PV = "3.107"

RPM_NAME = "tv-common-3.107-2.11.aarch64.rpm"
RPM_HASH = "a0f90702552f85a542eb0c4e896a51a882285253d0e9c9ec7e2ec4362471a42bcbc84287c8e3558ed86a1082e4afcb56a494e0cf62dd7cc745a03a827e7a4501"

RPROVIDES:${PN} += "tv-common \
xawtv-/usr/X11R6/lib/X11/fonts/misc/led-iso8859-1.bdf"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXaw.so.7 \
libXmu.so.6 \
libXt.so.6 \
libc.so.6 \
libdv.so.4 \
libjpeg.so.8 \
libm.so.6 \
libquicktime.so.0 \
libv4l2.so.0"

inherit rpm
