SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "libgstvideo-1_0-0-1.22.5-1.1.aarch64.rpm"
RPM_HASH = "eb913f343176e01256037497e161c05dd4ed5927b4bc18ac989a2252dbef27e4dd2ab810f89a93b73ceb6896281e011dff8b99eeda3b9c49ae16a3bb167cae1b"

RPROVIDES:${PN} += "libgstvideo-1-0-0 \
libgstvideo-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
gstreamer-plugins-base \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstbase-1.0.so.0 \
libgstreamer-1.0.so.0 \
libm.so.6 \
liborc-0.4.so.0"

inherit rpm
