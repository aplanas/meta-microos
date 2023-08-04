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

RPM_NAME = "typelib-1_0-GstSdp-1_0-1.22.5-2.1.aarch64.rpm"
RPM_HASH = "9f5e3f779a0eada78284d4e613067ec26757493bf7e633b9cee71cf4bef06d4cbc568eb068ab1d8971c59c18b49dced4a7c51f626e27c74d062fbf8f3d443753"

RPROVIDES:${PN} += "typelib-1-0-GstSdp-1-0 \
typelib-GstSdp"

RDEPENDS:${PN} += "libgstsdp-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gst"

inherit rpm
