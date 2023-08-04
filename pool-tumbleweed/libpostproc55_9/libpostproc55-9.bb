SUMMARY = "FFmpeg post-processing library"
DESCRIPTION = "A library with video postprocessing filters, such as deblocking and \
deringing filters, noise reduction, automatic contrast and brightness \
correction, linear/cubic interpolating deinterlacing."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.4"

RPM_NAME = "libpostproc55_9-4.4.4-2.2.aarch64.rpm"
RPM_HASH = "c4d559a039fa7d8def574e119ac0863d3b182e74d391f4e1236de3857ea8eac303ab66645c8d79d060679360f70d807297ba754e0dc7e8fded34290b356b0d63"

RPROVIDES:${PN} += "libpostproc.so.55.9 \
libpostproc55-9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libavutil.so.56.70 \
libavutil56-70 \
libc.so.6"

inherit rpm
