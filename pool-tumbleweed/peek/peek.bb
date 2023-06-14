SUMMARY = "An animated GIF recorder"
DESCRIPTION = "A simple tool that allows you to record short animated GIF images from your screen. \
Currently, only X11 window system is supported."
LICENSE = "GPL-3.0-or-later"

PV = "1.5.1"

RPM_NAME = "peek-1.5.1-2.18.aarch64.rpm"
RPM_HASH = "edcd191ebd808088cd3db33fc88c9568a48f7864b7a18a2cd2f1aac5274f64608acac7d9be894da3a9c94d368ed56921f9c494006e0ba760b4b0cecf48a5fc3c"

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
