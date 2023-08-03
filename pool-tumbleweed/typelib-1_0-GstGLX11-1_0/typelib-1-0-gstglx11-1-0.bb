SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins -- Introspection bindings"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins. \
 \
This package provides the GObject Introspection bindings for GStreamer \
plug-ins."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "typelib-1_0-GstGLX11-1_0-1.22.5-1.1.aarch64.rpm"
RPM_HASH = "a47abdb257cb996b48a9eadc5c313a612fdb046fb9934d5044a714707f4a81ea889899ab351243b18cd4a40c9b92161e58b9d87f5a4a366b5092eb3b5fa076fa"

RPROVIDES:${PN} += "typelib-1-0-GstGLX11-1-0 \
typelib-GstGLX11"

RDEPENDS:${PN} += "libgstgl-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gst \
typelib-GstBase \
typelib-GstGL \
typelib-GstVideo"

inherit rpm
