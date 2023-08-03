SUMMARY = "Streaming-Media Framework Runtime"
DESCRIPTION = "GStreamer is a streaming-media framework, based on graphs of filters \
which operate on media data. Applications using this library can do \
anything from real-time sound processing to playing videos, and just \
about anything else media-related.  Its plug-in-based architecture \
means that new data types or processing capabilities can be added by \
installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "gstreamer-1.22.5-1.1.aarch64.rpm"
RPM_HASH = "1dfa3b4d768ff940590d2353e7b510a4a85691894f86d3fb1e325d18185dd425a792476c9e46cb9772b98c6be157ab1e3e1c1f769d5ac162e5403fd3a57ab922"

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
