SUMMARY = "GStreamer based Command Line Music Player"
DESCRIPTION = "The gst123 program is a command line player akin to ogg123 or mpg123, \
but uses gstreamer for decoding, so supports all the codecs gstreamer \
knows."
LICENSE = "LGPL-2.0-or-later"

PV = "0.4.1"

RPM_NAME = "gst123-0.4.1-1.1.aarch64.rpm"
RPM_HASH = "cc157269913e7af32d82b4543d3067e3c47b83d5310ea584ba55894aa81965e5c61a3914e91f4f4eb2974c24e64924469ac45992c514bd9227e37b700ab8c32b"

RPROVIDES:${PN} += "gst123"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0 \
libgstvideo-1.0.so.0 \
libgtk-3.so.0 \
libstdc++.so.6 \
libtinfo.so.6"

inherit rpm
