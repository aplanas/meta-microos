SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing newplug-ins. \
 \
This package contains well-written plug-ins that can't be shipped in \
gstreamer-plugins-good because: \
- the license is not LGPL \
- the license of the library is not LGPL \
- there are possible licensing issues with the code."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "gstreamer-plugins-ugly-1.22.5-2.1.aarch64.rpm"
RPM_HASH = "aa032c472078670f46d238561927395ef3e17a3cee8a2e6b4a4b4911fd42f3c4c86707ffedaf2c789392ef2015c79fa9f0e0fe0898bbc9c4d9165f29e589398f"

RPROVIDES:${PN} += "gst-plugins-ugly \
gstreamer-plugins-ugly \
gstreamer1 \
libgsta52dec.so \
libgstamrnb.so \
libgstamrwbdec.so \
libgstcdio.so \
libgstdvdlpcmdec.so \
libgstdvdread.so \
libgstdvdsub.so \
libgstmpeg2dec.so \
libgstrealmedia.so \
patched-subset"

RDEPENDS:${PN} += "gstreamer-plugins-base \
ld-linux-aarch64.so.1 \
liba52.so.0 \
libc.so.6 \
libcdio.so.19 \
libdvdread.so.8 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgstaudio-1.0.so.0 \
libgstbase-1.0.so.0 \
libgstpbutils-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgstrtsp-1.0.so.0 \
libgstsdp-1.0.so.0 \
libgsttag-1.0.so.0 \
libgstvideo-1.0.so.0 \
libmpeg2.so.0 \
libopencore-amrnb.so.0 \
libopencore-amrwb.so.0 \
liborc-0.4.so.0"

inherit rpm
