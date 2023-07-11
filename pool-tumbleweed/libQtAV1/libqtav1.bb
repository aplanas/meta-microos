SUMMARY = "Qt multimedia framework library"
DESCRIPTION = "QtAV is a multimedia playback library based on Qt and FFmpeg. \
 \
This package contains the QtAV library."
LICENSE = "LGPL-2.1-or-later & GPL-3.0-only"

PV = "1.13.0"

RPM_NAME = "libQtAV1-1.13.0-3.27.aarch64.rpm"
RPM_HASH = "998d38ef8f6b32a9e099d0e68a836f228c3a1d3f790c0fa9b3ef76f16e46e4d0d352dd69ec183ac118792a4f008e8f12bd113e9a8f33847cc982fbe792667de9"

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
