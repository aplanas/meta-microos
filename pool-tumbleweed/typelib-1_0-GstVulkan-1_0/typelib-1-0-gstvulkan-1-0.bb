SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins -- Introspection bindings"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.3"

RPM_NAME = "typelib-1_0-GstVulkan-1_0-1.22.3-1.1.aarch64.rpm"
RPM_HASH = "9d6bafdb76c23439eb56c92db7cb2f014502b85f6e7306144f7abed6cd72c8adeb9b45b78b233d671f42aad8400ca92cc768212325f81d2581c730873a924dbe"

RPROVIDES:${PN} += "typelib(GstVulkan) \
typelib-1_0-GstVulkan-1_0 \
typelib-1_0-GstVulkan-1_0(aarch-64)"
RDEPENDS:${PN} += "libgstvulkan-1.0.so.0()(64bit) \
typelib(GLib) \
typelib(GModule) \
typelib(GObject) \
typelib(Gst) \
typelib(GstBase) \
typelib(GstVideo) \
typelib(Vulkan)"

inherit rpm
