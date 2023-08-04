SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins -- Introspection bindings"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "typelib-1_0-GstVulkan-1_0-1.22.5-2.1.aarch64.rpm"
RPM_HASH = "5335aba9c4503e93e3386d40558463dd0e57bf53b68cdd3366ac9a70ba52f19542bab77f965de0e157197b39743f4c1065bbfb6e2b4bf06500c53874a69c4b83"

RPROVIDES:${PN} += "typelib-1-0-GstVulkan-1-0 \
typelib-GstVulkan"

RDEPENDS:${PN} += "libgstvulkan-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gst \
typelib-GstBase \
typelib-GstVideo \
typelib-Vulkan"

inherit rpm
