SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins -- Introspection bindings"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.3"

RPM_NAME = "typelib-1_0-GstWebRTC-1_0-1.22.3-1.1.aarch64.rpm"
RPM_HASH = "4a8fc156552c6fe502a084114f0281b6e8427fe3aebd686e00dc78431bfdb52a4452d4cae42ba8314179af9402ec0d9354cef37b8e668d6c620495d522fb5684"

RPROVIDES:${PN} += "typelib(GstWebRTC) \
typelib-1_0-GstWebRTC-1_0 \
typelib-1_0-GstWebRTC-1_0(aarch-64)"
RDEPENDS:${PN} += "libgstwebrtc-1.0.so.0()(64bit) \
typelib(GLib) \
typelib(GModule) \
typelib(GObject) \
typelib(Gst) \
typelib(GstSdp)"

inherit rpm
