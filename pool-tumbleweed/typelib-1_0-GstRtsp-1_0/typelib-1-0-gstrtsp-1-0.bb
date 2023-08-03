SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins -- Introspection bindings"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins. \
 \
This package provides the GObject Introspection bindings for GStreamer \
plug-ins."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "typelib-1_0-GstRtsp-1_0-1.22.5-1.1.aarch64.rpm"
RPM_HASH = "94cf4d7fc3afc06cddb2f339d5916fbf693ffe9f0fc7788e4a84e0751703c68a75c6e83f5ed915b3f7d2f45335eefe4da199441f96a06f08a6adb32ee5f328ec"

RPROVIDES:${PN} += "typelib-1-0-GstRtsp-1-0 \
typelib-GstRtsp"

RDEPENDS:${PN} += "libgstrtsp-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio \
typelib-Gst \
typelib-GstBase \
typelib-GstSdp"

inherit rpm
