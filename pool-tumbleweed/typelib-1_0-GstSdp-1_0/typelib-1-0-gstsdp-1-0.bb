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

RPM_NAME = "typelib-1_0-GstSdp-1_0-1.22.5-3.1.aarch64.rpm"
RPM_HASH = "eb781942c93d405ea51bd4723c93d9693a2fe9c3c88dc91a67c0a24d8b25ed571cc92b9732a15f92a1fd00a334a44f7d4f2a53c088a810e9598b5201f78ffb27"

RPROVIDES:${PN} += "typelib-1-0-GstSdp-1-0 \
typelib-GstSdp"

RDEPENDS:${PN} += "libgstsdp-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gst"

inherit rpm
