SUMMARY = "GStreamer pipeline validator"
DESCRIPTION = "GstValidate detects when elements are not behaving as expected and \
report it to the user so he knows how things are supposed to work \
inside a GstPipeline. In the end, fixing issues found by the tool will \
ensure that all elements behave all together in the expected way."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.3"

RPM_NAME = "libgstvalidate-1_0-0-1.22.3-1.1.aarch64.rpm"
RPM_HASH = "b805b5d9814d64bed11c93e4c50a61357af9cf4c6a10afcad48d7824cbaac0fe25b57f7ed00062092bd2abe792f4ca2d1c33ed2732d625e8dfef60c557451a48"

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
