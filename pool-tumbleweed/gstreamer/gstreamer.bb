SUMMARY = "Streaming-Media Framework Runtime"
DESCRIPTION = "GStreamer is a streaming-media framework, based on graphs of filters \
which operate on media data. Applications using this library can do \
anything from real-time sound processing to playing videos, and just \
about anything else media-related.  Its plug-in-based architecture \
means that new data types or processing capabilities can be added by \
installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.3"

RPM_NAME = "gstreamer-1.22.3-1.1.aarch64.rpm"
RPM_HASH = "1d8f70c3870146ecbe749df3dd58a3c8e529c48273a3892e82e9999482934f7756867e5a9f12dcdfbaa1e3bc7e3b710dae91a6d84cb7f9a4ed60a707a17d292b"

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
