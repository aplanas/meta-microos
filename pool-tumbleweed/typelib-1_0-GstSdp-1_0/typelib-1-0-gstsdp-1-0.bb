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

RPM_NAME = "typelib-1_0-GstSdp-1_0-1.22.5-1.1.aarch64.rpm"
RPM_HASH = "8a5bb11ac9710782ff887ec36cbd29bd30589e44606aa03d2dfea063550a9b826ffb75489bb787e57dd509fe0298ff49956ff5b37f586aa5a3cbb7f5672331b3"

RPROVIDES:${PN} += "typelib-1-0-GstSdp-1-0 \
typelib-GstSdp"

RDEPENDS:${PN} += "libgstsdp-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gst"

inherit rpm
