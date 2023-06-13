SUMMARY = "GObject introspection bindings for the GStreamer pipeline validator"
DESCRIPTION = "GstValidate detects when elements are not behaving as expected and \
report it to the user so he knows how things are supposed to work \
inside a GstPipeline. In the end, fixing issues found by the tool will \
ensure that all elements behave all together in the expected way."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.3"

RPM_NAME = "typelib-1_0-GstValidate-1_0-1.22.3-1.1.aarch64.rpm"
RPM_HASH = "e303e5a7c50bd428d1a3b3b9c953b5c0855527043d787c597635950ccdeb0e8494db92040f8cfdcde64033dc22709d241f9f1b3fef04001991876ce7d22df09b"

RPROVIDES:${PN} += "typelib(GstValidate) \
typelib-1_0-GstValidate-1_0 \
typelib-1_0-GstValidate-1_0(aarch-64)"

RDEPENDS:${PN} += "libgstvalidate-1.0.so.0()(64bit) \
typelib(GLib) \
typelib(GModule) \
typelib(GObject) \
typelib(Gio) \
typelib(Gst) \
typelib(GstAudio) \
typelib(GstBase) \
typelib(GstPbutils) \
typelib(GstVideo)"

inherit rpm
