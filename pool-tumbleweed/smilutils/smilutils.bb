SUMMARY = "Tools for converting and editing digital video (DV) data"
DESCRIPTION = "These tools can be used to convert DV to image streams, avi or mov \
files and back, duplicate or drop frames and to convert kino projects \
to DV, raw audio and raw yuv video \
 \
More details can be found using 'man smilutils' and at: \
http://users.pandora.be/acp/kino/smilutils.html"
LICENSE = "GPL-2.0-or-later"

PV = "0.3.2+cvs20070731"

RPM_NAME = "smilutils-0.3.2+cvs20070731-22.14.aarch64.rpm"
RPM_HASH = "f613a6981f8b490376db2f48dca80f3f7863c43d71801b3fbe24cc97c6b3e0ab5be0fbfb1941795cb52116326fb0e4392785d962f27d4a84b00cd4d424d55e35"

RPROVIDES:${PN} += "libkinoextensions.so.0()(64bit) \
libkinolegacy.so.0()(64bit) \
smilutils \
smilutils(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
ld-linux-aarch64.so.1()(64bit) \
libSDL-1.2.so.0()(64bit) \
libX11.so.6()(64bit) \
libc.so.6()(64bit) \
libdv.so.4()(64bit) \
libgcc_s.so.1()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libm.so.6()(64bit) \
libquicktime.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libxml2.so.2()(64bit)"

inherit rpm
