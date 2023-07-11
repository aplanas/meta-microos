SUMMARY = "Streaming-Media Framework Runtime"
DESCRIPTION = "GStreamer is a streaming-media framework, based on graphs of filters \
which operate on media data. Applications using this library can do \
anything from real-time sound processing to playing videos, and just \
about anything else media-related.  Its plug-in-based architecture \
means that new data types or processing capabilities can be added by \
installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.4"

RPM_NAME = "gstreamer-1.22.4-1.1.aarch64.rpm"
RPM_HASH = "2c7d0528a83dcf14705ab7b492661d90d8ddd09e717740e3b4bfc1fd11546e949d09e90efc45a68d0124d83ba24def7b38bdfdea925513a67dd75cf325e34b47"

RPROVIDES:${PN} += "gstreamer \
gstreamer-doc \
libgstcoreelements.so \
libgstcoretracers.so"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstbase-1.0.so.0 \
libgstreamer-1-0-0 \
libgstreamer-1.0.so.0 \
permissions"

inherit rpm
