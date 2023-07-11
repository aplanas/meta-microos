SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins -- Introspection bindings"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.4"

RPM_NAME = "typelib-1_0-GstVulkanWayland-1_0-1.22.4-1.1.aarch64.rpm"
RPM_HASH = "759640f345b8ecb5a5c1c834cebcd97fedb938c6a4ef9d2b3260431efebe1b00ad7a3f86d9525cd6d2f3ece0aa457192bb3674ec59f5111aaadce20575b2e51d"

RPROVIDES:${PN} += "typelib-1-0-GstVulkanWayland-1-0 \
typelib-GstVulkanWayland"

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
