SUMMARY = "Python Bindings for GStreamer"
DESCRIPTION = "This module contains a wrapper that allows GStreamer applications to be \
written in Python."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "python311-gst-1.22.5-1.1.aarch64.rpm"
RPM_HASH = "d6d07de07f19b7ba6d2423b3f3dd7b930a1530ce106b7b664de608bdd1413fe2a73f5460f6799946c7b54918ed54a0e8fcc5c3962796d01c29348688a3b917c2"

RPROVIDES:${PN} += "python3-gst \
python311-gst"

RDEPENDS:${PN} += "gstreamer \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0 \
libpython3.11.so.1.0 \
python-abi \
typelib-GLib \
typelib-Gst \
typelib-GstAudio \
typelib-GstPbutils \
typelib-GstVideo"

inherit rpm
