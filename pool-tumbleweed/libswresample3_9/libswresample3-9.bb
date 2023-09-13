SUMMARY = "FFmpeg software resampling library"
DESCRIPTION = "The libswresample library performs audio conversion between different \
sample rates, channel layout and channel formats."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.4"

RPM_NAME = "libswresample3_9-4.4.4-2.3.aarch64.rpm"
RPM_HASH = "d8bde1642b89143f53913cb5c6c205d45ebc0563e8836834bfe101f7174553ef238695385d576cbafcea89fb0272e59f00190edd831d2d9462fd68dca10960d3"

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
