SUMMARY = "Miscellaneous utility routines for X"
DESCRIPTION = "The Xmu library is a collection of miscellaneous (some might say random) \
utility functions that have been useful in building various applications \
and widgets, specifically the Athena Widgets."
LICENSE = "MIT"

PV = "1.1.4"

RPM_NAME = "libXmu6-1.1.4-1.3.aarch64.rpm"
RPM_HASH = "efcf4ae076ed70bf467a8837f21992213810e5bc1fbf16c9847f0fe9585e7d017d47ce00a78e3bc45a92d29c25d5eab0f68fffe6eb626dd72ac2d716a6050850"

RPROVIDES:${PN} += "libXmu.so.6 \
libXmu6 \
xorg-x11-libXmu"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXt.so.6 \
libc.so.6 \
xbitmaps"

inherit rpm
