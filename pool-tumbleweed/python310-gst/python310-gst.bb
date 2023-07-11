SUMMARY = "Python Bindings for GStreamer"
DESCRIPTION = "This module contains a wrapper that allows GStreamer applications to be \
written in Python."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.4"

RPM_NAME = "python310-gst-1.22.4-1.1.aarch64.rpm"
RPM_HASH = "8e96a136b05b9173ef2fe0c92c04abe612b7a6109bb3557ea4959d85300355a3d5d169870480d22f3867438456855201133372f02d845bf8beb0badbe25714c2"

RPROVIDES:${PN} += "python310-gst"

RDEPENDS:${PN} += "gstreamer \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0 \
libpython3.10.so.1.0 \
python-abi \
typelib-GLib \
typelib-Gst \
typelib-GstAudio \
typelib-GstPbutils \
typelib-GstVideo"

inherit rpm
