SUMMARY = "Video thumbnail generator"
DESCRIPTION = "Video thumbnailer that can be used by file managers. \
 \
This video thumbnailer can be used to create thumbnails for video \
files. The thumbnailer uses ffmpeg to decode frames from files."
LICENSE = "GPL-2.0-or-later"

PV = "2.2.2"

RPM_NAME = "libffmpegthumbnailer4-2.2.2-2.6.aarch64.rpm"
RPM_HASH = "ba22d6c0ea8e821337c7f04cef880c262943aee80c9fbeac9a5b8bbb0cdcbf3e16291f2b0dfc51117656113fdbaf94979075d07f1078be857f20dd5ab5cf3917"

RPROVIDES:${PN} += "libffmpegthumbnailer.so.4 \
libffmpegthumbnailer4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libavcodec.so.60 \
libavfilter.so.9 \
libavformat.so.60 \
libavutil.so.58 \
libc.so.6 \
libgcc-s.so.1 \
libjpeg.so.8 \
libm.so.6 \
libpng16.so.16 \
libstdc++.so.6"

inherit rpm
