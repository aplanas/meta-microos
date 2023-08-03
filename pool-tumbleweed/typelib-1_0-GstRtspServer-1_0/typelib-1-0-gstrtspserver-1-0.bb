SUMMARY = "Introspection bindings for the GStreamer-based RTSP server library"
DESCRIPTION = "Introspection bindings for the GStreamer library for building an RTSP server."
LICENSE = "LGPL-2.0-or-later"

PV = "1.22.5"

RPM_NAME = "typelib-1_0-GstRtspServer-1_0-1.22.5-1.1.aarch64.rpm"
RPM_HASH = "a5317936ed70e3347d7c896574fed689f44aa82e18ae898a9fe4f60cd185fabfddf53cb3c529bee9c3b2a26ae735f6347d86f9db224d622a2644479ebb202161"

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
