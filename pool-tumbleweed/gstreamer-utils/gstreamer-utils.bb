SUMMARY = "Streaming-Media Framework Runtime"
DESCRIPTION = "GStreamer is a streaming-media framework, based on graphs of filters \
which operate on media data. Applications using this library can do \
anything from real-time sound processing to playing videos, and just \
about anything else media-related.  Its plug-in-based architecture \
means that new data types or processing capabilities can be added by \
installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.3"

RPM_NAME = "gstreamer-utils-1.22.3-1.1.aarch64.rpm"
RPM_HASH = "07e02102a7250183ad9f8da86189562a71684859d91da0d771219fc7510d04d6c0453abf3e4c2b97c2135ef05303286cd507e31d4ca2f0ca67c493524cb54ac8"

RPROVIDES:${PN} += "gstreamer-utils \
gstreamer-utils(aarch-64) \
gstreamer-utils_versioned \
gstreamer:/usr/bin/gst-launch-1.0"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit)"

inherit rpm
