SUMMARY = "GStreamer based Command Line Music Player"
DESCRIPTION = "The gst123 program is a command line player akin to ogg123 or mpg123, \
but uses gstreamer for decoding, so supports all the codecs gstreamer \
knows."
LICENSE = "LGPL-2.0+"

PV = "0.3.5"

RPM_NAME = "gst123-0.3.5-1.24.aarch64.rpm"
RPM_HASH = "5c60ad68097421ad65ea49d8b02db85660e5e60c090d625011a30bcddd1f267e43257b2e17ce93abcc8b98c44c11fcdb4c3c151268f7a7c69dda47020cacd954"

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
