SUMMARY = "Introspection bindings for the GStreamer Transcoder API"
DESCRIPTION = "This subpackage contains the introspection bindings for the GStreamer Transcoding API."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "typelib-1_0-GstTranscoder-1_0-1.22.5-2.1.aarch64.rpm"
RPM_HASH = "25152e51ac50c4bdb104fea314ebeef54e9c85dab16081f7e4d458a59661548a219f4cb65739f77704f97c974123001eb07938fb85223bfc4857ab50cc9cd3c0"

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
