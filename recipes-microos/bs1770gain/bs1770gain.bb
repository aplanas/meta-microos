SUMMARY = "A loudness scanner compliant with ITU-R BS.1770"
DESCRIPTION = "The command line tool bs1770gain is a loudness scanner compliant with \
ITU-R BS.1770 and its flavors EBU R128, ATSC A/85, and ReplayGain 2.0. \
It helps normalizing the loudness of audio and video files to the same \
level."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.4.1"

RPM_NAME = "bs1770gain-0.8.4.1-1.6.aarch64.rpm"
RPM_HASH = "18987d915bf08f9d3dd6810da3325c4569dfc7135bb2fcb5b62a703deed8a42ea9a0323fcb9a18ad04fbbef2e2a419d1f0394c605ad77739e38061f0ddbc35f5"

RPROVIDES:${PN} += "bs1770gain bs1770gain(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libavcodec.so.60()(64bit) libavcodec.so.60(LIBAVCODEC_60.3_SUSE)(64bit) libavfilter.so.9()(64bit) libavfilter.so.9(LIBAVFILTER_9.3_SUSE)(64bit) libavformat.so.60()(64bit) libavformat.so.60(LIBAVFORMAT_60.3_SUSE)(64bit) libavutil.so.58()(64bit) libavutil.so.58(LIBAVUTIL_58.2_SUSE)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libpostproc.so.57()(64bit) libpostproc.so.57(LIBPOSTPROC_57.1_SUSE)(64bit) libswresample.so.4()(64bit) libswresample.so.4(LIBSWRESAMPLE_4.10_SUSE)(64bit) libswscale.so.7()(64bit) libswscale.so.7(LIBSWSCALE_7.1_SUSE)(64bit)"

inherit rpm
