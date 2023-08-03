SUMMARY = "GObject introspection bindings for the GStreamer pipeline validator"
DESCRIPTION = "GstValidate detects when elements are not behaving as expected and \
report it to the user so he knows how things are supposed to work \
inside a GstPipeline. In the end, fixing issues found by the tool will \
ensure that all elements behave all together in the expected way."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "typelib-1_0-GstValidate-1_0-1.22.5-1.1.aarch64.rpm"
RPM_HASH = "410773a0687bee56775eb7121a5652eb1de9c24611916b541e7497e5b59b07f2211901db04e9167a571869f2e07357012f7ecee013499303ba4abfbf46a0f44e"

RPROVIDES:${PN} += "typelib-1-0-GstValidate-1-0 \
typelib-GstValidate"

RDEPENDS:${PN} += "libgstvalidate-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio \
typelib-Gst \
typelib-GstAudio \
typelib-GstBase \
typelib-GstPbutils \
typelib-GstVideo"

inherit rpm
