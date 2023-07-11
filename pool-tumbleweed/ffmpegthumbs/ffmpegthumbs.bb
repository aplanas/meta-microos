SUMMARY = "FFmpeg-based thumbnail creator for video files"
DESCRIPTION = "FFmpeg-based thumbnail creator for video files."
LICENSE = "LGPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "ffmpegthumbs-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "93a06f068f9f2313b7af9386f4445f4f6130ad1cc09af7fc7cca7a54eee23a15a09d2b9025cbf1ab8747e628c005cadf24e05f9c7c10d3faf74a666745cf718c"

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
