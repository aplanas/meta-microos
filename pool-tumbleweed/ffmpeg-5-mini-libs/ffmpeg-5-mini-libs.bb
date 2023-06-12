SUMMARY = "Feature-reduced build of FFmpeg, a multimedia framework"
DESCRIPTION = "FFmpeg is a multimedia framework. \
This package contains a cut-down version for building other packages."
LICENSE = "GPL-3.0-or-later"

PV = "5.1.3"

RPM_NAME = "ffmpeg-5-mini-libs-5.1.3-1.1.aarch64.rpm"
RPM_HASH = "83f6ca0b8156c0c9d90f6c3658aa098ae8959a39a33c7f490abe2c5418016c2c17a47aa01509d1329cf2bf0611b1aa74acba536074b67b71b1f44b1fe741dff1"

RPROVIDES:${PN} += "ffmpeg-5-mini-libs \
ffmpeg-5-mini-libs(aarch-64) \
libavcodec.so.59()(64bit) \
libavcodec.so.59(LIBAVCODEC_59.37_SUSE)(64bit) \
libavdevice.so.59()(64bit) \
libavdevice.so.59(LIBAVDEVICE_59.7_SUSE)(64bit) \
libavfilter.so.8()(64bit) \
libavfilter.so.8(LIBAVFILTER_8.44_SUSE)(64bit) \
libavformat.so.59()(64bit) \
libavformat.so.59(LIBAVFORMAT_59.27_SUSE)(64bit) \
libavutil.so.57()(64bit) \
libavutil.so.57(LIBAVUTIL_57.28_SUSE)(64bit) \
libpostproc.so.56()(64bit) \
libpostproc.so.56(LIBPOSTPROC_56.6_SUSE)(64bit) \
libswresample.so.4.ff5()(64bit) \
libswresample.so.4.ff5(LIBSWRESAMPLE_4.7_SUSE)(64bit) \
libswscale.so.6()(64bit) \
libswscale.so.6(LIBSWSCALE_6.7_SUSE)(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libm.so.6(GLIBC_2.35)(64bit) \
this-is-only-for-build-envs"

inherit rpm
