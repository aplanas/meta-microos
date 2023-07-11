SUMMARY = "FFmpeg software resampling library"
DESCRIPTION = "The libswresample library performs audio conversion between different \
sample rates, channel layout and channel formats."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.4"

RPM_NAME = "libswresample3_9-4.4.4-2.1.aarch64.rpm"
RPM_HASH = "581e760f513b2d6b3ba4c228c95e563ca7272dc5f42cabf5b0c91ace550c2af8e18b67b214b74c9be226e5c4db3de7dbc7677fcaf008af3f585c4fb599554b11"

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
