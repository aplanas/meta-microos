SUMMARY = "Miscellaneous utility routines for X"
DESCRIPTION = "The Xmu library is a collection of miscellaneous (some might say random) \
utility functions that have been useful in building various applications \
and widgets, specifically the Athena Widgets."
LICENSE = "MIT"

PV = "1.1.4"

RPM_NAME = "libXmu6-1.1.4-1.2.aarch64.rpm"
RPM_HASH = "fdc056c8c06ffdd0f4c85f14e40ca907ccf643cf29282a00de50ce623476cae82fe29cbd3255e665f80d046cd6c872414fd11743ec36a8e4aeb8c5b4f7dd707c"

RPROVIDES:${PN} += "libXmu.so.6()(64bit) \
libXmu6 \
libXmu6(aarch-64) \
xorg-x11-libXmu"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libX11.so.6()(64bit) \
libXext.so.6()(64bit) \
libXt.so.6()(64bit) \
libc.so.6()(64bit) \
xbitmaps"

inherit rpm
