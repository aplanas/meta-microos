SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins -- Introspection bindings"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "typelib-1_0-GstVulkanWayland-1_0-1.22.5-2.1.aarch64.rpm"
RPM_HASH = "2af8a8e622a5e0b2ea4409d48b9798fc5e316ec91e90c49ca24bd15ff620e7a0d4636591a82263e8fde7cb2b51504dc417e44aca7a2045ed696cadb2b2f2975a"

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
