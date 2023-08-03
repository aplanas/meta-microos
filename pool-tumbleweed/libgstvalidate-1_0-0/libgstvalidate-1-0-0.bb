SUMMARY = "GStreamer pipeline validator"
DESCRIPTION = "GstValidate detects when elements are not behaving as expected and \
report it to the user so he knows how things are supposed to work \
inside a GstPipeline. In the end, fixing issues found by the tool will \
ensure that all elements behave all together in the expected way."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "libgstvalidate-1_0-0-1.22.5-1.1.aarch64.rpm"
RPM_HASH = "fe8fd119395f0555064b02b169bc90a975b6c8bfd3cbead56b07b6eaf3a1c7ecd69a0ec8d4b929ed736cce1b42b90fc07a6adcd4faa9eeb1dd2b56b833efe1ce"

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
