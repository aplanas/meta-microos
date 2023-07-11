SUMMARY = "GStreamer pipeline validator"
DESCRIPTION = "GstValidate detects when elements are not behaving as expected and \
report it to the user so he knows how things are supposed to work \
inside a GstPipeline. In the end, fixing issues found by the tool will \
ensure that all elements behave all together in the expected way."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.4"

RPM_NAME = "libgstvalidate-1_0-0-1.22.4-1.1.aarch64.rpm"
RPM_HASH = "8060ee6374d0deda0cff7ca8fd94ad05b7b65aca47629555a7b246cfdf74d5b75871b44e85953cc317417612ef8990001c4a71fdcd4d71678a21c8d74cd68668"

RPROVIDES:${PN} += "libgstvalidate-1-0-0 \
libgstvalidate-1.0.so.0 \
libgstvalidate-default-overrides-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgstbase-1.0.so.0 \
libgstcheck-1.0.so.0 \
libgstcontroller-1.0.so.0 \
libgstpbutils-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgstvideo-1.0.so.0 \
libjson-glib-1.0.so.0 \
libm.so.6"

inherit rpm
