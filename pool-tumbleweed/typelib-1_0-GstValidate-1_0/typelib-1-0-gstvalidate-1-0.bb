SUMMARY = "GObject introspection bindings for the GStreamer pipeline validator"
DESCRIPTION = "GstValidate detects when elements are not behaving as expected and \
report it to the user so he knows how things are supposed to work \
inside a GstPipeline. In the end, fixing issues found by the tool will \
ensure that all elements behave all together in the expected way."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.4"

RPM_NAME = "typelib-1_0-GstValidate-1_0-1.22.4-1.1.aarch64.rpm"
RPM_HASH = "25307601595d556e20e78e29e5d5e05c67b39d676d2e216d1e32643de9f24258124a6753519a2132c0d61485bc2c3ef1c54640d849b87e82aff5f4c2564f14cb"

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
