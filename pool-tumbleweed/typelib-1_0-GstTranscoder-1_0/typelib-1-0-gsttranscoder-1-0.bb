SUMMARY = "Introspection bindings for the GStreamer Transcoder API"
DESCRIPTION = "This subpackage contains the introspection bindings for the GStreamer Transcoding API."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.4"

RPM_NAME = "typelib-1_0-GstTranscoder-1_0-1.22.4-1.1.aarch64.rpm"
RPM_HASH = "10dd561cc1a5e881ce125359182c1e0d1a0523bbd21bdea490118fe605df7bac23ad851bc64a2082fc1725ae69debb785c633114bca47fc34b882aa8f1648e58"

RPROVIDES:${PN} += "typelib-1-0-GstTranscoder-1-0 \
typelib-GstTranscoder"

RDEPENDS:${PN} += "libgsttranscoder-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gst \
typelib-GstAudio \
typelib-GstBase \
typelib-GstPbutils \
typelib-GstVideo"

inherit rpm
