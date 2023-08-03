SUMMARY = "Python Bindings for GStreamer"
DESCRIPTION = "This module contains a wrapper that allows GStreamer applications to be \
written in Python."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "python310-gst-1.22.5-1.1.aarch64.rpm"
RPM_HASH = "10966ea234ba313d7c3b8c5f457ffe8d89356b20436a088d5e7e94bfd1516f8cfbb45aa9f09d531a2dd51e5f30e5b0f6b3f922f6fccc493134c2ddf834c526c1"

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
