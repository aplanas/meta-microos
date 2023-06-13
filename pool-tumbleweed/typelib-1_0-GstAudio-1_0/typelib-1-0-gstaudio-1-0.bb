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

PV = "1.22.3"

RPM_NAME = "typelib-1_0-GstAudio-1_0-1.22.3-1.1.aarch64.rpm"
RPM_HASH = "adeb9353828536a4c1e0231b8df4b9eb4f28852bd47bba2f9528b22a14bf87f7dc025096df9d558961f0fc38ebfd23947532a46c8a65f6d459fe381cec0c5411"

RPROVIDES:${PN} += "typelib(GstAudio) \
typelib-1_0-GstAudio-1_0 \
typelib-1_0-GstAudio-1_0(aarch-64)"

RDEPENDS:${PN} += "libgstaudio-1.0.so.0()(64bit) \
typelib(GLib) \
typelib(GModule) \
typelib(GObject) \
typelib(Gst) \
typelib(GstBase)"

inherit rpm
