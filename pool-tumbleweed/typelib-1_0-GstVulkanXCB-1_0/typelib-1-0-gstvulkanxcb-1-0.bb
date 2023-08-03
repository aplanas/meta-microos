SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins -- Introspection bindings"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "typelib-1_0-GstVulkanXCB-1_0-1.22.5-1.1.aarch64.rpm"
RPM_HASH = "b2d187183cacd05e68de2339d999b633cd8a6bc3456e78a0c4eba3226909fae08caa3367f505b26f29f418923fdc0a1859c66d4e7ce889f7a0508ae214563736"

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
