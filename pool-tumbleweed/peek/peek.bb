SUMMARY = "An animated GIF recorder"
DESCRIPTION = "A simple tool that allows you to record short animated GIF images from your screen. \
Currently, only X11 window system is supported."
LICENSE = "GPL-3.0-or-later"

PV = "1.5.1"

RPM_NAME = "peek-1.5.1-2.20.aarch64.rpm"
RPM_HASH = "31096dbc7f698f2543b60572a7b4631e73baa4ebdfadf47a3f48219b68a2f7e570fc28e55088395b1c57ade65b6f8180b9dfe55349878c19fcf9b5f0345bdc15"

RPROVIDES:${PN} += "peek"

RDEPENDS:${PN} += "ImageMagick \
ffmpeg \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libkeybinder-3.0.so.0 \
libpango-1.0.so.0"

inherit rpm
