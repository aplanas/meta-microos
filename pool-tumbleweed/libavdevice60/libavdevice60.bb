SUMMARY = "FFmpeg device library"
DESCRIPTION = "The libavdevice library provides a generic framework for grabbing from \
and rendering to many common multimedia input/output devices, and \
supports several input and output devices, including Video4Linux2, VfW, \
DShow, and ALSA."
LICENSE = "GPL-3.0-or-later"

PV = "6.0"

RPM_NAME = "libavdevice60-6.0-2.4.aarch64.rpm"
RPM_HASH = "e3f614ce3822fa57d02573b163e63643b394d1ef00e1e06aef7bc325fe891f5c548d0ea12d946cb81f6f4ee88f905b09cdac7f1b003d33bbde0e2e413dda7dcc"

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
