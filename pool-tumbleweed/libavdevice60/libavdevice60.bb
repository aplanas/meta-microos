SUMMARY = "FFmpeg device library"
DESCRIPTION = "The libavdevice library provides a generic framework for grabbing from \
and rendering to many common multimedia input/output devices, and \
supports several input and output devices, including Video4Linux2, VfW, \
DShow, and ALSA."
LICENSE = "GPL-3.0-or-later"

PV = "6.0"

RPM_NAME = "libavdevice60-6.0-3.1.aarch64.rpm"
RPM_HASH = "1d733d96deed9106005cade2f64f2cf2f30cabc2c930a0bd332b0eaba165a4a1329dfd5dc084ab8f4d1f5fe949a3e8690a397e6a54555e3e4b05cd38c25a6225"

RPROVIDES:${PN} += "libavdevice.so.60 \
libavdevice60"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libasound.so.2 \
libavcodec.so.60 \
libavcodec60 \
libavfilter.so.9 \
libavfilter9 \
libavformat.so.60 \
libavformat60 \
libavutil.so.58 \
libavutil58 \
libc.so.6 \
libcdio-cdda.so.2 \
libcdio-paranoia.so.2 \
libdc1394.so.26 \
libdrm.so.2 \
libjack.so.0 \
libpulse.so.0 \
libxcb-shape.so.0 \
libxcb-shm.so.0 \
libxcb-xfixes.so.0 \
libxcb.so.1"

inherit rpm
