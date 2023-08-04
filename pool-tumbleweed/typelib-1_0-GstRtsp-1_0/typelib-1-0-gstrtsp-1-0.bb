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

RPM_NAME = "typelib-1_0-GstRtsp-1_0-1.22.5-2.1.aarch64.rpm"
RPM_HASH = "3e1e4f632cfcf479cccb9d8fac79db53ae927e4bb0608d00721d18b56ecfd11786b5e61d0fe0cea51bf732816da3ec6e9a4256970df420ad81009c0f0fd7be0b"

RPROVIDES:${PN} += "typelib-1-0-GstRtsp-1-0 \
typelib-GstRtsp"

RDEPENDS:${PN} += "libgstrtsp-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio \
typelib-Gst \
typelib-GstBase \
typelib-GstSdp"

inherit rpm
