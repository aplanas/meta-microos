SUMMARY = "GStreamer plugins from libcamera"
DESCRIPTION = "libcamera is an experimental camera user-space API. \
This is its integration plugin for gstreamer."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.0.4"

RPM_NAME = "gstreamer-plugins-libcamera-0.0.4-2.5.aarch64.rpm"
RPM_HASH = "866132f62c37af1ca21b903cfc1b85843252516284effaa133084c2c8a76daf73f10bf4ea28e2272285e9685b3af95edbcda3c932271710a6a0e0a0a1bda6b14"

RPROVIDES:${PN} += "gstreamer-plugins-libcamera \
gstreamer1 \
libgstlibcamera.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcamera-base.so.0.0.4 \
libcamera.so.0.0.4 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstallocators-1.0.so.0 \
libgstbase-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgstvideo-1.0.so.0 \
libstdc++.so.6"

inherit rpm
