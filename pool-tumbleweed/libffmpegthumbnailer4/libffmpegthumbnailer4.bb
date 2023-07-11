SUMMARY = "Video thumbnail generator"
DESCRIPTION = "Video thumbnailer that can be used by file managers. \
 \
This video thumbnailer can be used to create thumbnails for video \
files. The thumbnailer uses ffmpeg to decode frames from files."
LICENSE = "GPL-2.0-or-later"

PV = "2.2.2"

RPM_NAME = "libffmpegthumbnailer4-2.2.2-2.7.aarch64.rpm"
RPM_HASH = "4eddb1920e83fbf66b634206522984ac02dc79ba7b5e4e7b3af4f6322ae96935515384156847206daefcf5540fd5313cb699cd5bae2f5e86e0ddf5d67ee3acc7"

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
