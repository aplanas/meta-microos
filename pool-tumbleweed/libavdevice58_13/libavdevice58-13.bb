SUMMARY = "FFmpeg device library"
DESCRIPTION = "The libavdevice library provides a generic framework for grabbing from \
and rendering to many common multimedia input/output devices, and \
supports several input and output devices, including Video4Linux2, VfW, \
DShow, and ALSA."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.4"

RPM_NAME = "libavdevice58_13-4.4.4-2.2.aarch64.rpm"
RPM_HASH = "ac867611fe10e7b955e44c37511a8fad11e3707b8c238fc72e05cc280b67fccf5f8d111d0fe83987c2ce2d586eb1e2a010e0cdec08ac4c1521087a3f90ecd767"

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
libdc1394.so.26 \
libdrm.so.2 \
libjack.so.0 \
libpulse.so.0 \
libv4l2.so.0 \
libxcb-shape.so.0 \
libxcb-shm.so.0 \
libxcb-xfixes.so.0 \
libxcb.so.1"

inherit rpm
