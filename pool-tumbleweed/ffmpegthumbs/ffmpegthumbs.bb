SUMMARY = "FFmpeg-based thumbnail creator for video files"
DESCRIPTION = "FFmpeg-based thumbnail creator for video files."
LICENSE = "LGPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "ffmpegthumbs-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "472ccd38dcd74cd0143f0a5927f32f6327d4724d718e21a2d593c1c44bdefe87007555e527baf95595af4030774dd40868303274769e493c389fc231902fdec0"

RPROVIDES:${PN} += "ffmpegthumbs"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5CoreAddons.so.5 \
libKF5KIOGui.so.5 \
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
