SUMMARY = "Frequency tables and some Tools for motv and xawtv"
DESCRIPTION = "This package includes frequency tables for various countries and some utilities \
for xawtv and motv (xawtv-remote, for example)."
LICENSE = "GPL-2.0-or-later"

PV = "3.107"

RPM_NAME = "tv-common-3.107-2.10.aarch64.rpm"
RPM_HASH = "11f24da052c130349fcf3eac109d0b01051fd4ae2bb779fce223a231f0ddd438885db958e54ec1d94b84fd68f80dbc4b5eb743edf02aa58565c6d33cccf12b71"

RPROVIDES:${PN} += "tv-common \
tv-common(aarch-64) \
xawtv:/usr/X11R6/lib/X11/fonts/misc/led-iso8859-1.bdf"

RDEPENDS:${PN} += "/bin/bash \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXaw.so.7()(64bit) \
libXmu.so.6()(64bit) \
libXt.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libdv.so.4()(64bit) \
libjpeg.so.8()(64bit) \
libjpeg.so.8(LIBJPEG_8.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libquicktime.so.0()(64bit) \
libv4l2.so.0()(64bit)"

inherit rpm
