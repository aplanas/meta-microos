SUMMARY = "FFmpeg-based thumbnail creator for video files"
DESCRIPTION = "FFmpeg-based thumbnail creator for video files."
LICENSE = "LGPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "ffmpegthumbs-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "e31cc3c3133477c939f91fa72c1910a55c891b6cf5f6b7caf7436f5b34f22ec171cfd01a8b291bcdc32e544287289a971d1d5af178b99bdc92a7581fb03b3727"

RPROVIDES:${PN} += "ffmpegthumbs"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5KIOWidgets.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libavcodec.so.60 \
libavfilter.so.9 \
libavformat.so.60 \
libavutil.so.58 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6 \
libswscale.so.7"

inherit rpm
