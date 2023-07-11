SUMMARY = "Python Bindings for GStreamer"
DESCRIPTION = "This module contains a wrapper that allows GStreamer applications to be \
written in Python."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.4"

RPM_NAME = "python311-gst-1.22.4-1.1.aarch64.rpm"
RPM_HASH = "6f457bb0cfff1ec01f825442b0602126c4c2fbae6551bf5cbd6eb53cbae5fc269227cd4d8d338a80694f4640de2d7dc264e4f4a3347949f03db7d720c2a99535"

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
