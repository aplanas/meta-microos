SUMMARY = "High Quality Television Application"
DESCRIPTION = "tvtime is a high quality television application for use with video \
capture cards.	tvtime processes the input from a capture card and \
displays it on a computer monitor or projector.  Unlike other \
television applications, tvtime focuses on high visual quality."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.11"

RPM_NAME = "tvtime-1.0.11-2.18.aarch64.rpm"
RPM_HASH = "d2929743663f5cf88490173cf4980f3faec86f271728194eb9726963c8bdb18b190ac0fcd344951736d08ddaea66ce96b39ceb4da0b5b0104f5bee91bbc3268e"

RPROVIDES:${PN} += "config-tvtime \
tvtime"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXinerama.so.1 \
libXv.so.1 \
libXxf86vm.so.1 \
libasound.so.2 \
libc.so.6 \
libfreetype.so.6 \
libpng16.so.16 \
libxml2.so.2"

inherit rpm
