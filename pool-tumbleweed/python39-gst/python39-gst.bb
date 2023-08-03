SUMMARY = "Python Bindings for GStreamer"
DESCRIPTION = "This module contains a wrapper that allows GStreamer applications to be \
written in Python."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "python39-gst-1.22.5-1.1.aarch64.rpm"
RPM_HASH = "078946db2de15a4f099b912d469a63f59faefe96fbdac657111def2f9cec4378751f536e2715fc58eb69c57dccf275b86afa0476439954444ef8c36bf609f226"

RPROVIDES:${PN} += "python39-gst"

RDEPENDS:${PN} += "gstreamer \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0 \
libpython3.9.so.1.0 \
python-abi \
typelib-GLib \
typelib-Gst \
typelib-GstAudio \
typelib-GstPbutils \
typelib-GstVideo"

inherit rpm
