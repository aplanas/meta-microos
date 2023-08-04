SUMMARY = "FFmpeg software resampling library"
DESCRIPTION = "The libswresample library performs audio conversion between different \
sample rates, channel layout and channel formats."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.4"

RPM_NAME = "libswresample3_9-4.4.4-2.2.aarch64.rpm"
RPM_HASH = "e745c9f3a4ae3a255e172fc60827b382d5bff293848d3b8f62e63cd7018158f6ae5181bd75a035da7bf59ab8992313e0aa130effd1572a3be5d1336abbff7e28"

RPROVIDES:${PN} += "libswresample.so.3.9 \
libswresample3-9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libavutil.so.56.70 \
libavutil56-70 \
libc.so.6 \
libm.so.6 \
libsoxr.so.0"

inherit rpm
