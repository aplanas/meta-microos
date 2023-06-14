SUMMARY = "FFmpeg device library"
DESCRIPTION = "The libavdevice library provides a generic framework for grabbing from \
and rendering to many common multimedia input/output devices, and \
supports several input and output devices, including Video4Linux2, VfW, \
DShow, and ALSA."
LICENSE = "GPL-3.0-or-later"

PV = "5.1.3"

RPM_NAME = "libavdevice59-5.1.3-1.2.aarch64.rpm"
RPM_HASH = "d2b0fceb55876e48187626b9ce78cdb8c2bc6159b3b41e781a33665e5b33fc67926c035c4ef62d54c547f541b160916584790013a1aa87f0890982ac2f90829a"

RPROVIDES:${PN} += "libavdevice.so.59 \
libavdevice59"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libasound.so.2 \
libavcodec.so.59 \
libavcodec59 \
libavfilter.so.8 \
libavfilter8 \
libavformat.so.59 \
libavformat59 \
libavutil.so.57 \
libavutil57 \
libc.so.6 \
libcdio-cdda.so.2 \
libcdio-paranoia.so.2 \
libdc1394.so.25 \
libdrm.so.2 \
libjack.so.0 \
libpulse.so.0 \
libxcb-shape.so.0 \
libxcb-shm.so.0 \
libxcb-xfixes.so.0 \
libxcb.so.1"

inherit rpm
