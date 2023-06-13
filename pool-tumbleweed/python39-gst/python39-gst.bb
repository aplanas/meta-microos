SUMMARY = "Python Bindings for GStreamer"
DESCRIPTION = "This module contains a wrapper that allows GStreamer applications to be \
written in Python."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.3"

RPM_NAME = "python39-gst-1.22.3-1.1.aarch64.rpm"
RPM_HASH = "98dca93808fa4f97c2fa229233a45e218b3cf24aa3060a9ca4d6faf0a08d9eaf181a16cd726217aeaa442f1a999542797759352c49fcf442172fcf3d5df4cec0"

RPROVIDES:${PN} += "python39-gst \
python39-gst(aarch-64)"

RDEPENDS:${PN} += "gstreamer \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
libpython3.9.so.1.0()(64bit) \
python(abi) \
typelib(GLib) \
typelib(Gst) \
typelib(GstAudio) \
typelib(GstPbutils) \
typelib(GstVideo)"

inherit rpm
