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

RPM_NAME = "typelib-1_0-GstRtsp-1_0-1.22.3-1.1.aarch64.rpm"
RPM_HASH = "e05635bd54b5e594bf3439cd31b870b5df1b1011f252ea5b92513c03567ea2ff19ba3636fafa7dfe1e3b81f4ba4fbc654723b9aee771e15a42da828c136d490a"

RPROVIDES:${PN} += "typelib(GstRtsp) \
typelib-1_0-GstRtsp-1_0 \
typelib-1_0-GstRtsp-1_0(aarch-64)"
RDEPENDS:${PN} += "libgstrtsp-1.0.so.0()(64bit) \
typelib(GLib) \
typelib(GModule) \
typelib(GObject) \
typelib(Gio) \
typelib(Gst) \
typelib(GstBase) \
typelib(GstSdp)"

inherit rpm
