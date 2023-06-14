SUMMARY = "Header files for the GStreamer development and debugging tools"
DESCRIPTION = "GstValidate detects when elements are not behaving as expected and \
report it to the user so he knows how things are supposed to work \
inside a GstPipeline. In the end, fixing issues found by the tool will \
ensure that all elements behave all together in the expected way."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.3"

RPM_NAME = "gstreamer-devtools-devel-1.22.3-1.1.aarch64.rpm"
RPM_HASH = "780dc31e92a3120d5f37ce14770ffb60077264d6fdebe011b7daf4d92ebbcc37bd8514236e4cacdcbb1332062b8216e428cfcb9e998b18e24cd43d58efcc2298"

RPROVIDES:${PN} += "gstreamer-devtools-devel \
gstreamer-validate-devel \
libgstvalidatefaultinjection.so \
libgstvalidategapplication.so \
libgstvalidategtk.so \
libgstvalidatessim.so \
libgstvalidatetracer.so \
pkgconfig-gstreamer-validate-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gstreamer-devtools \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgstbase-1.0.so.0 \
libgstcheck-1.0.so.0 \
libgstcontroller-1.0.so.0 \
libgstpbutils-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgstvalidate-1-0-0 \
libgstvalidate-1.0.so.0 \
libgstvideo-1.0.so.0 \
libgtk-3.so.0 \
libjson-glib-1.0.so.0 \
libm.so.6 \
pkgconfig-gio-2.0 \
pkgconfig-gmodule-no-export-2.0 \
pkgconfig-gstreamer-1.0 \
pkgconfig-gstreamer-base-1.0 \
pkgconfig-gstreamer-check-1.0 \
pkgconfig-gstreamer-controller-1.0 \
pkgconfig-gstreamer-pbutils-1.0 \
pkgconfig-json-glib-1.0 \
typelib-1-0-GstValidate-1-0"

inherit rpm
