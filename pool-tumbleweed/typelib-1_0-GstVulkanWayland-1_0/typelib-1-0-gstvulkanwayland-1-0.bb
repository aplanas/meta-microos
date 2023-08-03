SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins -- Introspection bindings"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "typelib-1_0-GstVulkanWayland-1_0-1.22.5-1.1.aarch64.rpm"
RPM_HASH = "1d47f9e686c859cc95f3b708a7c7f43aec6a2b2eae9193bf831db48e92f41a8b6391aa4d80f0bbe4552f77c404b6e61350f6e651bff4de9ddad6d23de253f17b"

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
