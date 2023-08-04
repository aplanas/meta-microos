SUMMARY = "FFmpeg software resampling library"
DESCRIPTION = "The libswresample library performs audio conversion between different \
sample rates, channel layout and channel formats."
LICENSE = "GPL-3.0-or-later"

PV = "5.1.3"

RPM_NAME = "libswresample4_ff5-5.1.3-2.2.aarch64.rpm"
RPM_HASH = "4a1e99c520ed27545fd6b6b5eeb8a30d4043069d74f6b5333469be3081f6e75569434697d16f4c2af51342af9d119f0ca0359ad39e06a22bef0437d05bfb5bc0"

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
