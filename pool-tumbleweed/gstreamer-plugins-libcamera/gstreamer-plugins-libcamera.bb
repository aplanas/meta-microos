SUMMARY = "GStreamer plugins from libcamera"
DESCRIPTION = "libcamera is an experimental camera user-space API. \
This is its integration plugin for gstreamer."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.0.4"

RPM_NAME = "gstreamer-plugins-libcamera-0.0.4-2.3.aarch64.rpm"
RPM_HASH = "48f2300dadaeb67f239f580c7d3a1f6a36bad3aa322604d7adafb0d6bb891d915fde0b50d3aa2e6d99e37fbc1cef944385304830466856b105f7ba039624b293"

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
