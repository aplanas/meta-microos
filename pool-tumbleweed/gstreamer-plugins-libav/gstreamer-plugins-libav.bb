SUMMARY = "A ffmpeg/libav plugin for GStreamer"
DESCRIPTION = "GStreamer is a streaming media framework, based on graphs of filters which \
operate on media data. Applications using this library can do anything \
from real-time sound processing to playing videos, and just about anything \
else media-related. Its plugin-based architecture means that new data \
types or processing capabilities can be added simply by installing new \
plug-ins. \
 \
This plugin contains the FFmpeg codecs, containing codecs for most popular \
multimedia formats."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "gstreamer-plugins-libav-1.22.5-1.1.aarch64.rpm"
RPM_HASH = "c633c640f8a0faaf6032f69b1d2110361087dba8753df52edc9aacec1d295d9bf4482a63e8da37f9351d985e3af7649ca16c5568ca40122730a34a0f7626b4e6"

RPROVIDES:${PN} += "gstreamer-plugins-libav \
gstreamer1 \
libgstlibav.so"

RDEPENDS:${PN} += "gstreamer \
ld-linux-aarch64.so.1 \
libavcodec.so.60 \
libavfilter.so.9 \
libavformat.so.60 \
libavutil.so.58 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstaudio-1.0.so.0 \
libgstbase-1.0.so.0 \
libgstpbutils-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgstvideo-1.0.so.0"

inherit rpm
