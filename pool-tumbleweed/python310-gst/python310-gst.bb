SUMMARY = "Python Bindings for GStreamer"
DESCRIPTION = "This module contains a wrapper that allows GStreamer applications to be \
written in Python."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.3"

RPM_NAME = "python310-gst-1.22.3-1.1.aarch64.rpm"
RPM_HASH = "97300e5a3793ce10c8e15f0365f18856235d6d5cd71fad3a29a25d4917c99c311cf127a585be0dd979c7780bf5d6271aaefc22b8272ac23b69c4c821c42eadf9"

RPROVIDES:${PN} += "python3-gst \
python310-gst \
python310-gst(aarch-64)"

RDEPENDS:${PN} += "gstreamer \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
libpython3.10.so.1.0()(64bit) \
python(abi) \
typelib(GLib) \
typelib(Gst) \
typelib(GstAudio) \
typelib(GstPbutils) \
typelib(GstVideo)"

inherit rpm
