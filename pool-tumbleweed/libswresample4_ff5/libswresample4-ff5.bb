SUMMARY = "FFmpeg software resampling library"
DESCRIPTION = "The libswresample library performs audio conversion between different \
sample rates, channel layout and channel formats."
LICENSE = "GPL-3.0-or-later"

PV = "5.1.3"

RPM_NAME = "libswresample4_ff5-5.1.3-2.1.aarch64.rpm"
RPM_HASH = "1f1363c041433ecd8e18115c2663f074d7b3407e17bf46f6747cfb2b864f92953a315b4409b62d873f3c8efb5a897786cb15694f19d28d7e6b5bf51836313354"

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
