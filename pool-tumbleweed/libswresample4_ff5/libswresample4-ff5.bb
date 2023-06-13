SUMMARY = "FFmpeg software resampling library"
DESCRIPTION = "The libswresample library performs audio conversion between different \
sample rates, channel layout and channel formats."
LICENSE = "GPL-3.0-or-later"

PV = "5.1.3"

RPM_NAME = "libswresample4_ff5-5.1.3-1.2.aarch64.rpm"
RPM_HASH = "723f949ef7c856ef642ca1357d1af958a591d6bc76175dd6f1810bac32ced7a1e68e77b0ddfdd4b521b3331cdcf67aff550e2dbe43787fa7d32a4622ba1658e0"

RPROVIDES:${PN} += "libswresample.so.4.ff5()(64bit) \
libswresample.so.4.ff5(LIBSWRESAMPLE_4.7_SUSE)(64bit) \
libswresample4_ff5 \
libswresample4_ff5(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libavutil.so.57()(64bit) \
libavutil.so.57(LIBAVUTIL_57.28_SUSE)(64bit) \
libavutil57 \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libsoxr.so.0()(64bit)"

inherit rpm
