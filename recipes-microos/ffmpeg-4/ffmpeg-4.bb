SUMMARY = "Set of libraries for working with various multimedia formats"
DESCRIPTION = "FFmpeg is a multimedia framework, able to decode, encode, \
transcode, mux, demux, stream, filter and play several formats \
that humans and machines have created. \
 \
 \
This build of ffmpeg is limited in the number of codecs supported."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.4"

RPM_NAME = "ffmpeg-4-4.4.4-1.1.aarch64.rpm"
RPM_HASH = "211d95a3bad65c381920d49501cb34c124d78a8d619155cf65fc44a3ebb10bbb0b0596fbe1c1c3a5310f5f07c2320d8bfb810465ac03fa20a3177df607bc2437"

RPROVIDES:${PN} += "ffmpeg ffmpeg-4 ffmpeg-4(aarch-64) ffmpeg-tools"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libSDL2-2.0.so.0()(64bit) libSDL2-2.0.so.0(SUSE_2.0.8)(64bit) libavcodec.so.58.134()(64bit) libavcodec.so.58.134(LIBAVCODEC_58)(64bit) libavcodec58_134 libavdevice.so.58.13()(64bit) libavdevice.so.58.13(LIBAVDEVICE_58)(64bit) libavdevice58_13 libavfilter.so.7.110()(64bit) libavfilter.so.7.110(LIBAVFILTER_7)(64bit) libavfilter7_110 libavformat.so.58.76()(64bit) libavformat.so.58.76(LIBAVFORMAT_58)(64bit) libavformat58_76 libavresample.so.4.0()(64bit) libavresample.so.4.0(LIBAVRESAMPLE_4)(64bit) libavresample4_0 libavutil.so.56.70()(64bit) libavutil.so.56.70(LIBAVUTIL_56)(64bit) libavutil56_70 libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libm.so.6(GLIBC_2.35)(64bit) libpostproc.so.55.9()(64bit) libpostproc.so.55.9(LIBPOSTPROC_55)(64bit) libpostproc55_9 libswresample.so.3.9()(64bit) libswresample.so.3.9(LIBSWRESAMPLE_3)(64bit) libswresample3_9 libswscale.so.5.9()(64bit) libswscale.so.5.9(LIBSWSCALE_5)(64bit) libswscale5_9 libz.so.1()(64bit)"

inherit rpm
