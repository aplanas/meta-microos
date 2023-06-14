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

RPM_NAME = "typelib-1_0-GstRtp-1_0-1.22.3-1.1.aarch64.rpm"
RPM_HASH = "b0db18ac580b658bc6eff5eb8a96442a85625e6a6dc994dd85da581733d8846e9983d37af44c857c3f66147ca80b01ec76eefc0bbf4a18df764f67f84f9de9bd"

RPROVIDES:${PN} += "typelib-1-0-GstRtp-1-0 \
typelib-GstRtp"

RDEPENDS:${PN} += "libgstrtp-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gst \
typelib-GstBase"

inherit rpm
