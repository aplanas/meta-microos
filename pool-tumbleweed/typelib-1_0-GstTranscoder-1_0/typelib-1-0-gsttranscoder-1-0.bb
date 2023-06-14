SUMMARY = "Introspection bindings for the GStreamer Transcoder API"
DESCRIPTION = "This subpackage contains the introspection bindings for the GStreamer Transcoding API."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.3"

RPM_NAME = "typelib-1_0-GstTranscoder-1_0-1.22.3-1.1.aarch64.rpm"
RPM_HASH = "4cec7f1d0ea5065b62aba284351f22aa1351d11a6f5a86d305c888d831ca525b4e19ca0f8d10568273452a35831d4a7738a3e47d0e16c34176417e82a8ee0651"

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
