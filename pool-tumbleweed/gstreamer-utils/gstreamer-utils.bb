SUMMARY = "Streaming-Media Framework Runtime"
DESCRIPTION = "GStreamer is a streaming-media framework, based on graphs of filters \
which operate on media data. Applications using this library can do \
anything from real-time sound processing to playing videos, and just \
about anything else media-related.  Its plug-in-based architecture \
means that new data types or processing capabilities can be added by \
installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.4"

RPM_NAME = "gstreamer-utils-1.22.4-1.1.aarch64.rpm"
RPM_HASH = "d6f74dcc9452cf3792563d7aead69ab37c84d4e76110a773fb963627016a9e47be823f0b9209d164a4fe561531293d85dea005c3a4b3d78e0abf3d1f797c21f0"

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
