SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "libgstbasecamerabinsrc-1_0-0-1.22.5-2.1.aarch64.rpm"
RPM_HASH = "e79bec086d6cd295ca31c5defedcd071ebfcc8440688613c7e8000a4aa7c430f473bb8bee97cc16a9616ab21d8d9149d67e43a1e7cb0dd2af9761205876aff69"

RPROVIDES:${PN} += "libgstbasecamerabinsrc-1-0-0 \
libgstbasecamerabinsrc-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstapp-1.0.so.0 \
libgstreamer-1.0.so.0"

inherit rpm
