SUMMARY = "FFmpeg software resampling library"
DESCRIPTION = "The libswresample library performs audio conversion between different \
sample rates, channel layout and channel formats."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.4"

RPM_NAME = "libswresample3_9-4.4.4-1.2.aarch64.rpm"
RPM_HASH = "c2171dc6feb148aa97f19ab3e6f86c04494947d79d62bfa22aef6921851eae5d0474fdd1ddc7dfe5ec2f0164de3dce15009de82b0c72b3917888d8d3e79d2e03"

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
