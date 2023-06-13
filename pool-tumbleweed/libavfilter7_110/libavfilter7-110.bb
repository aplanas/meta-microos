SUMMARY = "FFmpeg audio and video filtering library"
DESCRIPTION = "The libavfilter library provides a generic audio/video filtering \
framework containing several filters, sources and sinks."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.4"

RPM_NAME = "libavfilter7_110-4.4.4-1.2.aarch64.rpm"
RPM_HASH = "ef7e6572f78abc4b0feb76a81f8e15e6e86583afc6f5e96cf24d88b6dacc2e20dbfd4c1e13d4a12689115d6441da0028f3ad8f634bc28ec52893e9ad07eaeeea"

RPROVIDES:${PN} += "libavfilter.so.7.110()(64bit) \
libavfilter.so.7.110(LIBAVFILTER_7)(64bit) \
libavfilter7_110 \
libavfilter7_110(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libSPIRV.so.12()(64bit) \
libass.so.9()(64bit) \
libavcodec.so.58.134()(64bit) \
libavcodec.so.58.134(LIBAVCODEC_58)(64bit) \
libavcodec58_134 \
libavformat.so.58.76()(64bit) \
libavformat.so.58.76(LIBAVFORMAT_58)(64bit) \
libavformat58_76 \
libavresample.so.4.0()(64bit) \
libavresample.so.4.0(LIBAVRESAMPLE_4)(64bit) \
libavresample4_0 \
libavutil.so.56.70()(64bit) \
libavutil.so.56.70(LIBAVUTIL_56)(64bit) \
libavutil56_70 \
libbs2b.so.0()(64bit) \
libc.so.6()(64bit) \
libfontconfig.so.1()(64bit) \
libfreetype.so.6()(64bit) \
libfribidi.so.0()(64bit) \
libglslang.so.12()(64bit) \
liblilv-0.so.0()(64bit) \
libm.so.6()(64bit) \
libmysofa.so.1()(64bit) \
libpostproc.so.55.9()(64bit) \
libpostproc.so.55.9(LIBPOSTPROC_55)(64bit) \
libpostproc55_9 \
librubberband.so.2()(64bit) \
libstdc++.so.6()(64bit) \
libswresample.so.3.9()(64bit) \
libswresample.so.3.9(LIBSWRESAMPLE_3)(64bit) \
libswresample3_9 \
libswscale.so.5.9()(64bit) \
libswscale.so.5.9(LIBSWSCALE_5)(64bit) \
libswscale5_9 \
libva.so.2()(64bit) \
libvidstab.so.1.1()(64bit) \
libvmaf.so.1()(64bit) \
libvulkan.so.1()(64bit) \
libzimg.so.2()(64bit) \
libzmq.so.5()(64bit)"

inherit rpm
