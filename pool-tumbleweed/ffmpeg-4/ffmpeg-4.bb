SUMMARY = "Set of libraries for working with various multimedia formats"
DESCRIPTION = "FFmpeg is a multimedia framework, able to decode, encode, \
transcode, mux, demux, stream, filter and play several formats \
that humans and machines have created. \
 \
 \
This build of ffmpeg is limited in the number of codecs supported."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.4"

RPM_NAME = "ffmpeg-4-4.4.4-1.2.aarch64.rpm"
RPM_HASH = "ed9ec1ef0246d4320bb3fce43381aab96a9d6575c0bd4a818709f62e1dfcc9e2b50c1a1bd9d75b74f3f1f0e38169ab8848c2c294075eff6b865d4b3fe9e5aaf0"

RPROVIDES:${PN} += "ffmpeg \
ffmpeg-4 \
ffmpeg-4(aarch-64) \
ffmpeg-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libSDL2-2.0.so.0()(64bit) \
libavcodec.so.58.134()(64bit) \
libavcodec.so.58.134(LIBAVCODEC_58)(64bit) \
libavcodec58_134 \
libavdevice.so.58.13()(64bit) \
libavdevice.so.58.13(LIBAVDEVICE_58)(64bit) \
libavdevice58_13 \
libavfilter.so.7.110()(64bit) \
libavfilter.so.7.110(LIBAVFILTER_7)(64bit) \
libavfilter7_110 \
libavformat.so.58.76()(64bit) \
libavformat.so.58.76(LIBAVFORMAT_58)(64bit) \
libavformat58_76 \
libavresample.so.4.0()(64bit) \
libavresample.so.4.0(LIBAVRESAMPLE_4)(64bit) \
libavresample4_0 \
libavutil.so.56.70()(64bit) \
libavutil.so.56.70(LIBAVUTIL_56)(64bit) \
libavutil56_70 \
libc.so.6()(64bit) \
libm.so.6()(64bit) \
libpostproc.so.55.9()(64bit) \
libpostproc.so.55.9(LIBPOSTPROC_55)(64bit) \
libpostproc55_9 \
libswresample.so.3.9()(64bit) \
libswresample.so.3.9(LIBSWRESAMPLE_3)(64bit) \
libswresample3_9 \
libswscale.so.5.9()(64bit) \
libswscale.so.5.9(LIBSWSCALE_5)(64bit) \
libswscale5_9 \
libz.so.1()(64bit)"

inherit rpm
