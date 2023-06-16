SUMMARY = "Frequency tables and some Tools for motv and xawtv"
DESCRIPTION = "This package includes frequency tables for various countries and some utilities \
for xawtv and motv (xawtv-remote, for example)."
LICENSE = "GPL-2.0-or-later"

PV = "3.107"

RPM_NAME = "tv-common-3.107-2.10.aarch64.rpm"
RPM_HASH = "11f24da052c130349fcf3eac109d0b01051fd4ae2bb779fce223a231f0ddd438885db958e54ec1d94b84fd68f80dbc4b5eb743edf02aa58565c6d33cccf12b71"

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
