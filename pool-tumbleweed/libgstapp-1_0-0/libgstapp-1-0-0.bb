SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "libgstapp-1_0-0-1.22.5-2.1.aarch64.rpm"
RPM_HASH = "090be4ce9e47e5198f789114ab4e096995a562f4348dbe44190938fdce25b86b2c27f7d3dddce3116b806663b0e9546ef3d2678b8f3fd73a977cf962e3b41579"

RPROVIDES:${PN} += "libgstapp-1-0-0 \
libgstapp-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
gstreamer-plugins-base \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstbase-1.0.so.0 \
libgstreamer-1.0.so.0"

inherit rpm
