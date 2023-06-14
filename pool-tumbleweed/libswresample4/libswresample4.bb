SUMMARY = "FFmpeg software resampling library"
DESCRIPTION = "The libswresample library performs audio conversion between different \
sample rates, channel layout and channel formats."
LICENSE = "GPL-3.0-or-later"

PV = "6.0"

RPM_NAME = "libswresample4-6.0-2.2.aarch64.rpm"
RPM_HASH = "22071955a230755e552b9854d026ad96b7ff177081d79c148df04777ee1211af6777d6f0ba13abdb9bdf3b784b7a10c0975529a6c55763b3d7db19f9bb2c1a48"

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
