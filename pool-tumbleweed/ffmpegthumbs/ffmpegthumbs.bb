SUMMARY = "FFmpeg-based thumbnail creator for video files"
DESCRIPTION = "FFmpeg-based thumbnail creator for video files."
LICENSE = "LGPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "ffmpegthumbs-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "e31cc3c3133477c939f91fa72c1910a55c891b6cf5f6b7caf7436f5b34f22ec171cfd01a8b291bcdc32e544287289a971d1d5af178b99bdc92a7581fb03b3727"

RPROVIDES:${PN} += "ffmpegthumbs \
ffmpegthumbs(aarch-64) \
metainfo() \
metainfo(org.kde.ffmpegthumbs.metainfo.xml)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5KIOWidgets.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libavcodec.so.60()(64bit) \
libavcodec.so.60(LIBAVCODEC_60.3_SUSE)(64bit) \
libavfilter.so.9()(64bit) \
libavfilter.so.9(LIBAVFILTER_9.3_SUSE)(64bit) \
libavformat.so.60()(64bit) \
libavformat.so.60(LIBAVFORMAT_60.3_SUSE)(64bit) \
libavutil.so.58()(64bit) \
libavutil.so.58(LIBAVUTIL_58.2_SUSE)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libswscale.so.7()(64bit) \
libswscale.so.7(LIBSWSCALE_7.1_SUSE)(64bit)"

inherit rpm
