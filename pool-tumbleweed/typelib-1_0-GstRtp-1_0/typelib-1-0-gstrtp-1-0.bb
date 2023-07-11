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

PV = "1.22.4"

RPM_NAME = "typelib-1_0-GstRtp-1_0-1.22.4-1.1.aarch64.rpm"
RPM_HASH = "515e98ebcd7b65a2103182799230c84ddc9971b7829d9022caa36c4b881582222185c2d3c0dd7e4b4aef8c92eb0cf26c23d9911affaf48962197d4be07bcc959"

RPROVIDES:${PN} += "typelib-1-0-GstRtp-1-0 \
typelib-GstRtp"

RDEPENDS:${PN} += "libgstrtp-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gst \
typelib-GstBase"

inherit rpm
