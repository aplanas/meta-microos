SUMMARY = "FFmpeg alternate audio resampling library"
DESCRIPTION = "An audio resampling library that is being provided for drop-in \
compatibility with libav. \
 \
It is advised to use libswresample for new code."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.4"

RPM_NAME = "libavresample4_0-4.4.4-2.1.aarch64.rpm"
RPM_HASH = "c0ab91b88c3a3f876a619b95a22987a73e40094aa0879a767f7c947dbb6cf5b0ad574c9bb3b367fa0f49e724b0de96ee990bea61e8ec2f2668a8e3eefe1edbdd"

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
