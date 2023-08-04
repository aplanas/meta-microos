SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins -- Introspection bindings"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "typelib-1_0-GstVulkanXCB-1_0-1.22.5-2.1.aarch64.rpm"
RPM_HASH = "c67f3a8083674fb4ca2037de7e7184e0dba9aa801b20a25587fecff952c8e4255a56276847a79120bd2ff80f79548eea11c5e7b2e2a1724c6c276daed6172e00"

RPROVIDES:${PN} += "typelib-1-0-GstVulkanXCB-1-0 \
typelib-GstVulkanXCB"

RDEPENDS:${PN} += "libgstvulkan-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gst \
typelib-GstBase \
typelib-GstVideo \
typelib-GstVulkan \
typelib-Vulkan"

inherit rpm
