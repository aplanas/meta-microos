SUMMARY = "FFmpeg alternate audio resampling library"
DESCRIPTION = "An audio resampling library that is being provided for drop-in \
compatibility with libav. \
 \
It is advised to use libswresample for new code."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.4"

RPM_NAME = "libavresample4_0-4.4.4-2.3.aarch64.rpm"
RPM_HASH = "73c8966d9002116c8491c37ce0db3363030fb12e4624a2a2849679902f1e958440e30b3437b6e31784f7beb34544c67ae7b21bb0a3b1132d03534ecbfc8d9030"

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
