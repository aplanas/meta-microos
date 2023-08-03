SUMMARY = "Streaming-Media Framework Runtime"
DESCRIPTION = "GStreamer is a streaming-media framework, based on graphs of filters \
which operate on media data. Applications using this library can do \
anything from real-time sound processing to playing videos, and just \
about anything else media-related.  Its plug-in-based architecture \
means that new data types or processing capabilities can be added by \
installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "gstreamer-utils-1.22.5-1.1.aarch64.rpm"
RPM_HASH = "7b47303d0fbe53aba88c8898cb3e7f3761f0169e181a0a4a6f07ba9b66682879709be58840560b17caeedf3240dd17dda1dade8189b6fe351df4705a573482cc"

RPROVIDES:${PN} += "gstreamer-/usr/bin/gst-launch-1.0 \
gstreamer-utils \
gstreamer-utils-versioned"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0"

inherit rpm
