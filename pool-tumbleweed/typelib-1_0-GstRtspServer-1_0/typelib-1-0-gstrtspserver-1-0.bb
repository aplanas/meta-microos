SUMMARY = "Introspection bindings for the GStreamer-based RTSP server library"
DESCRIPTION = "Introspection bindings for the GStreamer library for building an RTSP server."
LICENSE = "LGPL-2.0-or-later"

PV = "1.22.4"

RPM_NAME = "typelib-1_0-GstRtspServer-1_0-1.22.4-1.1.aarch64.rpm"
RPM_HASH = "22f885d74dd071c6320bcb9f5015a5467d09dc14af17ac455c6829eb4f9de83ba63c29d6061eec4439c0d2432f74a3ff06849c0a0f37aede0ccdf69305d59401"

RPROVIDES:${PN} += "typelib-1-0-GstRtspServer-1-0 \
typelib-GstRtspServer"

RDEPENDS:${PN} += "libgstrtspserver-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio \
typelib-Gst \
typelib-GstBase \
typelib-GstNet \
typelib-GstRtsp \
typelib-GstSdp"

inherit rpm
