SUMMARY = "FFmpeg software resampling library"
DESCRIPTION = "The libswresample library performs audio conversion between different \
sample rates, channel layout and channel formats."
LICENSE = "GPL-3.0-or-later"

PV = "5.1.3"

RPM_NAME = "libswresample4_ff5-5.1.3-1.2.aarch64.rpm"
RPM_HASH = "723f949ef7c856ef642ca1357d1af958a591d6bc76175dd6f1810bac32ced7a1e68e77b0ddfdd4b521b3331cdcf67aff550e2dbe43787fa7d32a4622ba1658e0"

RPROVIDES:${PN} += "libswresample.so.4.ff5 \
libswresample4-ff5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libavutil.so.57 \
libavutil57 \
libc.so.6 \
libm.so.6 \
libsoxr.so.0"

inherit rpm
