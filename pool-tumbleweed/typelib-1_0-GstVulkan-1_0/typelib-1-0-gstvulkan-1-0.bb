SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins -- Introspection bindings"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.4"

RPM_NAME = "typelib-1_0-GstVulkan-1_0-1.22.4-1.1.aarch64.rpm"
RPM_HASH = "d97787a564ec3cbb963340a1e1a317db159ff33b36194e1cc72bc8531bddced15b0061fbf763783faf3e57176594505ce0dac89fd81cfffacd3a8185026e43fb"

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
