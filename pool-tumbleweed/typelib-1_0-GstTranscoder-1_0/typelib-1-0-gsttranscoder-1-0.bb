SUMMARY = "Introspection bindings for the GStreamer Transcoder API"
DESCRIPTION = "This subpackage contains the introspection bindings for the GStreamer Transcoding API."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "typelib-1_0-GstTranscoder-1_0-1.22.5-1.1.aarch64.rpm"
RPM_HASH = "68e335d7253df7333d99f3989e47c663a0a4c487730c0b209ebe7598dc7ca67b097ee84e3a4dd5104f5a288a8af3f460296077dd53a6904b67cb003473c5afdf"

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
