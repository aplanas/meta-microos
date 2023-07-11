SUMMARY = "An animated GIF recorder"
DESCRIPTION = "A simple tool that allows you to record short animated GIF images from your screen. \
Currently, only X11 window system is supported."
LICENSE = "GPL-3.0-or-later"

PV = "1.5.1"

RPM_NAME = "peek-1.5.1-2.19.aarch64.rpm"
RPM_HASH = "ed4599a9776e5b56f95af7f8371cf09607d4f1d34a2d919d2dbb90b6f70c8614f1addf6d0f5e02658788fac928c5639b8869026375971dd817c885827829db4f"

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
