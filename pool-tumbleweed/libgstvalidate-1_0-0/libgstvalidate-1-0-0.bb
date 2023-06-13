SUMMARY = "GStreamer pipeline validator"
DESCRIPTION = "GstValidate detects when elements are not behaving as expected and \
report it to the user so he knows how things are supposed to work \
inside a GstPipeline. In the end, fixing issues found by the tool will \
ensure that all elements behave all together in the expected way."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.3"

RPM_NAME = "libgstvalidate-1_0-0-1.22.3-1.1.aarch64.rpm"
RPM_HASH = "b805b5d9814d64bed11c93e4c50a61357af9cf4c6a10afcad48d7824cbaac0fe25b57f7ed00062092bd2abe792f4ca2d1c33ed2732d625e8dfef60c557451a48"

RPROVIDES:${PN} += "libgstvalidate-1.0.so.0()(64bit) \
libgstvalidate-1_0-0 \
libgstvalidate-1_0-0(aarch-64) \
libgstvalidate-default-overrides-1.0.so.0()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgstbase-1.0.so.0()(64bit) \
libgstcheck-1.0.so.0()(64bit) \
libgstcontroller-1.0.so.0()(64bit) \
libgstpbutils-1.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
libgstvideo-1.0.so.0()(64bit) \
libjson-glib-1.0.so.0()(64bit) \
libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
