SUMMARY = "FFmpeg alternate audio resampling library"
DESCRIPTION = "An audio resampling library that is being provided for drop-in \
compatibility with libav. \
 \
It is advised to use libswresample for new code."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.4"

RPM_NAME = "libavresample4_0-4.4.4-2.2.aarch64.rpm"
RPM_HASH = "31945a777390aa558b9fb41b5c53c41fe7ad48c72969c56983e2c3d94459558f92907fdedd74dd9795e405a55e3e36ec44fdd306837a2f694d1c5492d35dd166"

RPROVIDES:${PN} += "libavresample.so.4.0 \
libavresample4 \
libavresample4-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libavutil.so.56.70 \
libavutil56-70 \
libc.so.6 \
libm.so.6"

inherit rpm
