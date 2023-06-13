SUMMARY = "An animated GIF recorder"
DESCRIPTION = "A simple tool that allows you to record short animated GIF images from your screen. \
Currently, only X11 window system is supported."
LICENSE = "GPL-3.0-or-later"

PV = "1.5.1"

RPM_NAME = "peek-1.5.1-2.18.aarch64.rpm"
RPM_HASH = "edcd191ebd808088cd3db33fc88c9568a48f7864b7a18a2cd2f1aac5274f64608acac7d9be894da3a9c94d368ed56921f9c494006e0ba760b4b0cecf48a5fc3c"

RPROVIDES:${PN} += "application() \
application(com.uploadedlobster.peek.desktop) \
metainfo() \
metainfo(com.uploadedlobster.peek.appdata.xml) \
peek \
peek(aarch-64)"

RDEPENDS:${PN} += "ImageMagick \
ffmpeg \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libkeybinder-3.0.so.0()(64bit) \
libpango-1.0.so.0()(64bit)"

inherit rpm
