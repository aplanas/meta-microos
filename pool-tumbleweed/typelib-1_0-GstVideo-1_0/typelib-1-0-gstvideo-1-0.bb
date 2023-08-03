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

RPM_NAME = "typelib-1_0-GstVideo-1_0-1.22.5-1.1.aarch64.rpm"
RPM_HASH = "30642835cc3cae90747c6d44c931523356bcd47925f19e5e9aa4833e795d41290759e5ded93a38d37d43486154f5394a6ba314e5942ff72736814c80611e2331"

RPROVIDES:${PN} += "typelib-1-0-GstVideo-1-0 \
typelib-GstVideo"

RDEPENDS:${PN} += "libgstvideo-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gst \
typelib-GstBase"

inherit rpm
