SUMMARY = "FFmpeg software resampling library"
DESCRIPTION = "The libswresample library performs audio conversion between different \
sample rates, channel layout and channel formats."
LICENSE = "GPL-3.0-or-later"

PV = "6.0"

RPM_NAME = "libswresample4-6.0-2.4.aarch64.rpm"
RPM_HASH = "96dc6ca99352da06366801893b7e77c042933e7fcea7942625667034a59d226f4eb29cb2254c0b721d161299bc7838898f30b2a23cc9a56bb69cb2aca01657ee"

RPROVIDES:${PN} += "libswresample.so.4 \
libswresample4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libavutil.so.58 \
libavutil58 \
libc.so.6 \
libm.so.6 \
libsoxr.so.0"

inherit rpm
