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

PV = "1.22.4"

RPM_NAME = "gstreamer-plugins-libav-1.22.4-1.1.aarch64.rpm"
RPM_HASH = "23c5bb7daadf0c1bddf1116c242c7f7f57e0971bd9ea6ad760bacd1f47164321eb225f3cf017e76f905c718d8316cf77683075d11a7fdafa318fbda7863d8cbc"

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
