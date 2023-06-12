SUMMARY = "Feature-reduced build of FFmpeg, a multimedia framework"
DESCRIPTION = "FFmpeg is a multimedia framework. \
This package contains a cut-down version for building other packages."
LICENSE = "GPL-3.0-or-later"

PV = "6.0"

RPM_NAME = "ffmpeg-6-mini-libs-6.0-2.1.aarch64.rpm"
RPM_HASH = "7d0a8e03379e90d9de497f631850f97ba69ce7ebd5297af51b837975452b98ec2d4bade2afc335cb59c8308ac6f624cfef3c317920d046146c6bdc8ec9719819"

RPROVIDES:${PN} += "ffmpeg-6-mini-libs \
ffmpeg-6-mini-libs(aarch-64) \
libavcodec.so.60()(64bit) \
libavcodec.so.60(LIBAVCODEC_60.3_SUSE)(64bit) \
libavdevice.so.60()(64bit) \
libavdevice.so.60(LIBAVDEVICE_60.1_SUSE)(64bit) \
libavfilter.so.9()(64bit) \
libavfilter.so.9(LIBAVFILTER_9.3_SUSE)(64bit) \
libavformat.so.60()(64bit) \
libavformat.so.60(LIBAVFORMAT_60.3_SUSE)(64bit) \
libavutil.so.58()(64bit) \
libavutil.so.58(LIBAVUTIL_58.2_SUSE)(64bit) \
libpostproc.so.57()(64bit) \
libpostproc.so.57(LIBPOSTPROC_57.1_SUSE)(64bit) \
libswresample.so.4()(64bit) \
libswresample.so.4(LIBSWRESAMPLE_4.10_SUSE)(64bit) \
libswscale.so.7()(64bit) \
libswscale.so.7(LIBSWSCALE_7.1_SUSE)(64bit)"
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
