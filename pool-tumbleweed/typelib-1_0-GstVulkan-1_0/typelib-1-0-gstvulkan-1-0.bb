SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins -- Introspection bindings"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "typelib-1_0-GstVulkan-1_0-1.22.5-1.1.aarch64.rpm"
RPM_HASH = "86415243a07ece81c8b0e4d29dc63285c0a6f3f41dc3a26ec9c45d581be3a91441f930428c770b6c92b7d123da8f13bdc5c42767b4fa061bd6c2a48bed45f33d"

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
