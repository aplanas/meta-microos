SUMMARY = "Video cutter that uses FFmpeg and GTK+"
DESCRIPTION = "CutterFF is a program for cutting videos using FFmpeg and GTK+. \
It does not decode/encode the streams, it only copies them. \
 \
Features \
 - Selecting which streams written to the output \
 - Selecting the format and bitstream filters \
 - Choose a program if video contains more than one \
 - Set cutpoints everywhere in the video \
 - Many formats and codecs supported by FFmpeg \
 - Log window for displaying FFmpeg messages"
LICENSE = "GPL-3.0-only"

PV = "1.0.2"

RPM_NAME = "cutterff-1.0.2-1.6.aarch64.rpm"
RPM_HASH = "c9da0938bb77b8662290fceaa96244fa7b185a5f05e8c38699b39cbc406212945429ebfbe310c915b7c673c880ef3f1334eccefdee0552a013872c5f09b248bf"

RPROVIDES:${PN} += "application() \
application(cutterff.desktop) \
cutterff \
cutterff(aarch-64) \
mimehandler(video/mp4) \
mimehandler(video/mpeg) \
mimehandler(video/quicktime) \
mimehandler(video/x-flv) \
mimehandler(video/x-ms-wmv) \
mimehandler(video/x-msvideo)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libavcodec.so.60()(64bit) \
libavcodec.so.60(LIBAVCODEC_60.3_SUSE)(64bit) \
libavformat.so.60()(64bit) \
libavformat.so.60(LIBAVFORMAT_60.3_SUSE)(64bit) \
libavutil.so.58()(64bit) \
libavutil.so.58(LIBAVUTIL_58.2_SUSE)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libpango-1.0.so.0()(64bit) \
libswscale.so.7()(64bit) \
libswscale.so.7(LIBSWSCALE_7.1_SUSE)(64bit)"

inherit rpm
