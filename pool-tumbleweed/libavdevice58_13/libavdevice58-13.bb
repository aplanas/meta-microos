SUMMARY = "FFmpeg device library"
DESCRIPTION = "The libavdevice library provides a generic framework for grabbing from \
and rendering to many common multimedia input/output devices, and \
supports several input and output devices, including Video4Linux2, VfW, \
DShow, and ALSA."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.4"

RPM_NAME = "libavdevice58_13-4.4.4-1.2.aarch64.rpm"
RPM_HASH = "9137ce6196eb754c960391fd3a099e90f30124d4ad3d3f758ae4e537c108b0ef5a73b95727ccf3a0fcadef30390c42ec9c5757433e1a4b8a0a8e707c4f31ba19"

RPROVIDES:${PN} += "libavdevice.so.58.13 \
libavdevice58-13"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libasound.so.2 \
libavcodec.so.58.134 \
libavcodec58-134 \
libavfilter.so.7.110 \
libavfilter7-110 \
libavformat.so.58.76 \
libavformat58-76 \
libavutil.so.56.70 \
libavutil56-70 \
libc.so.6 \
libcdio-cdda.so.2 \
libcdio-paranoia.so.2 \
libdc1394.so.25 \
libdrm.so.2 \
libjack.so.0 \
libpulse.so.0 \
libv4l2.so.0 \
libxcb-shape.so.0 \
libxcb-shm.so.0 \
libxcb-xfixes.so.0 \
libxcb.so.1"

inherit rpm
