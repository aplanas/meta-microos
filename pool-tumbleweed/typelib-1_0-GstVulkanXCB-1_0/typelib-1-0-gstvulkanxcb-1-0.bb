SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins -- Introspection bindings"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.4"

RPM_NAME = "typelib-1_0-GstVulkanXCB-1_0-1.22.4-1.1.aarch64.rpm"
RPM_HASH = "460732253d3235aa8a24d8f98fd7632203d4b3351b2017cfd8a743b3f744ad35665edcc9a987ca790fb5512d9699c18a89b7836c2708ad7960b251c5db2a4eb7"

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
