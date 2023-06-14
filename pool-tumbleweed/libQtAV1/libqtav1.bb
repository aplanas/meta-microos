SUMMARY = "Qt multimedia framework library"
DESCRIPTION = "QtAV is a multimedia playback library based on Qt and FFmpeg. \
 \
This package contains the QtAV library."
LICENSE = "LGPL-2.1-or-later & GPL-3.0-only"

PV = "1.13.0"

RPM_NAME = "libQtAV1-1.13.0-3.25.aarch64.rpm"
RPM_HASH = "83079911d17f46cb797c619fe7e74d357dd9a95ee1e1367fbe2ec01ea11d568cf8c950058813ee272c720459ad9ca19607b1558c86860c12e7162b8991f47f77"

RPROVIDES:${PN} += "libQtAV.so.1 \
libQtAV1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGLESv2.so.2 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libX11.so.6 \
libavcodec.so.58.134 \
libavdevice.so.58.13 \
libavfilter.so.7.110 \
libavformat.so.58.76 \
libavresample.so.4.0 \
libavutil.so.56.70 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libpulse.so.0 \
libstdc++.so.6 \
libswresample.so.3.9 \
libswscale.so.5.9 \
libva.so.2"

inherit rpm
