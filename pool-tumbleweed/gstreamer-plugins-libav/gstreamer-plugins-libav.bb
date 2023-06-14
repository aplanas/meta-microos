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

PV = "1.22.3"

RPM_NAME = "gstreamer-plugins-libav-1.22.3-1.1.aarch64.rpm"
RPM_HASH = "44cbcd5f317d1da0ef12e1abc282d76d9a39320c5c9c2af5f44b73ed866e61ada042b1143c28be8c80eb2a32d494a69a4598e97049543b58272b40a50ce70845"

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
