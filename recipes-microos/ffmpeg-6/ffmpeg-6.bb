SUMMARY = "Set of libraries for working with various multimedia formats"
DESCRIPTION = "FFmpeg is a multimedia framework, able to decode, encode, \
transcode, mux, demux, stream, filter and play several formats \
that humans and machines have created. \
 \
 \
This build of ffmpeg is limited in the number of codecs supported."
LICENSE = "GPL-3.0-or-later"

PV = "6.0"

RPM_NAME = "ffmpeg-6-6.0-2.1.aarch64.rpm"
RPM_HASH = "a89c5899680cb07f4c19aa34cffca74212996d3ad603c199bc28668192221b8f67c05e184cc17e36be9cad83abb183de968373921432cf90fa5ee654abbf9c73"

RPROVIDES:${PN} += "ffmpeg ffmpeg-6 ffmpeg-6(aarch-64) ffmpeg-tools"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libSDL2-2.0.so.0()(64bit) libSDL2-2.0.so.0(SUSE_2.0.8)(64bit) libavcodec.so.60()(64bit) libavcodec.so.60(LIBAVCODEC_60.3_SUSE)(64bit) libavcodec60 libavdevice.so.60()(64bit) libavdevice.so.60(LIBAVDEVICE_60.1_SUSE)(64bit) libavdevice60 libavfilter.so.9()(64bit) libavfilter.so.9(LIBAVFILTER_9.3_SUSE)(64bit) libavfilter9 libavformat.so.60()(64bit) libavformat.so.60(LIBAVFORMAT_60.3_SUSE)(64bit) libavformat60 libavutil.so.58()(64bit) libavutil.so.58(LIBAVUTIL_58.2_SUSE)(64bit) libavutil58 libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libm.so.6(GLIBC_2.35)(64bit) libpostproc.so.57()(64bit) libpostproc.so.57(LIBPOSTPROC_57.1_SUSE)(64bit) libpostproc57 libswresample.so.4()(64bit) libswresample.so.4(LIBSWRESAMPLE_4.10_SUSE)(64bit) libswresample4 libswscale.so.7()(64bit) libswscale.so.7(LIBSWSCALE_7.1_SUSE)(64bit) libswscale7 libz.so.1()(64bit)"

inherit rpm
