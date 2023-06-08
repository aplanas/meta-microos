SUMMARY = "Set of libraries for working with various multimedia formats"
DESCRIPTION = "FFmpeg is a multimedia framework, able to decode, encode, \
transcode, mux, demux, stream, filter and play several formats \
that humans and machines have created. \
 \
 \
This build of ffmpeg is limited in the number of codecs supported."
LICENSE = "GPL-3.0-or-later"

PV = "5.1.3"

RPM_NAME = "ffmpeg-5-5.1.3-1.1.aarch64.rpm"
RPM_HASH = "40383aa444a275d90a4fcc3392575b330065f9e00b2e54c2ad6b87940b6d66a183103e16d0ec20b6f553a4f84cba0110c94bef9a4a0a46b2b1d230e4dbef77fd"

RPROVIDES:${PN} += "ffmpeg ffmpeg-5 ffmpeg-5(aarch-64) ffmpeg-tools"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libSDL2-2.0.so.0()(64bit) libSDL2-2.0.so.0(SUSE_2.0.8)(64bit) libavcodec.so.59()(64bit) libavcodec.so.59(LIBAVCODEC_59.37_SUSE)(64bit) libavcodec59 libavdevice.so.59()(64bit) libavdevice.so.59(LIBAVDEVICE_59.7_SUSE)(64bit) libavdevice59 libavfilter.so.8()(64bit) libavfilter.so.8(LIBAVFILTER_8.44_SUSE)(64bit) libavfilter8 libavformat.so.59()(64bit) libavformat.so.59(LIBAVFORMAT_59.27_SUSE)(64bit) libavformat59 libavutil.so.57()(64bit) libavutil.so.57(LIBAVUTIL_57.28_SUSE)(64bit) libavutil57 libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libm.so.6(GLIBC_2.35)(64bit) libpostproc.so.56()(64bit) libpostproc.so.56(LIBPOSTPROC_56.6_SUSE)(64bit) libpostproc56 libswresample.so.4.ff5()(64bit) libswresample.so.4.ff5(LIBSWRESAMPLE_4.7_SUSE)(64bit) libswresample4_ff5 libswscale.so.6()(64bit) libswscale.so.6(LIBSWSCALE_6.7_SUSE)(64bit) libswscale6 libz.so.1()(64bit)"

inherit rpm
