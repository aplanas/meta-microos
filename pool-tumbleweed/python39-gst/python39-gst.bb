SUMMARY = "Python Bindings for GStreamer"
DESCRIPTION = "This module contains a wrapper that allows GStreamer applications to be \
written in Python."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.4"

RPM_NAME = "python39-gst-1.22.4-1.1.aarch64.rpm"
RPM_HASH = "7fd48b80fba0dddbc72aae9f1f311e4303ca921a4ded9ed13f6b1d19ccc952020ecbbff0ff6824de25eb66480abd72dc0d3dd89f61fd8c984028ae031d6bacac"

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
