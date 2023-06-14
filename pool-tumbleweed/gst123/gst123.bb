SUMMARY = "GStreamer based Command Line Music Player"
DESCRIPTION = "The gst123 program is a command line player akin to ogg123 or mpg123, \
but uses gstreamer for decoding, so supports all the codecs gstreamer \
knows."
LICENSE = "LGPL-2.0+"

PV = "0.3.5"

RPM_NAME = "gst123-0.3.5-1.23.aarch64.rpm"
RPM_HASH = "e74be4a8d5526b135dd8bd7128f9f0d117dad59ae50932102c5ad232ba3d582a76676f6dcb421e61a250a3f8298a2820f04a229d82690923336c962a3040bf06"

RPROVIDES:${PN} += "gst123"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0 \
libgstvideo-1.0.so.0 \
libgtk-x11-2.0.so.0 \
libstdc++.so.6 \
libtinfo.so.6"

inherit rpm
