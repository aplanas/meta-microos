SUMMARY = "FFmpeg image scaling and colorspace/pixel conversion library"
DESCRIPTION = "The libswscale library performs image scaling and colorspace and \
pixel format conversion operations."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.4"

RPM_NAME = "libswscale5_9-4.4.4-2.3.aarch64.rpm"
RPM_HASH = "f670a9bccd09571d69ee1fad728726061aaa3ef637a9c3d3da9a9dc8338f62f3f177929187ae25e07a7b361d701c113d337718ea677cfb68f295fa7ded8201a4"

RPROVIDES:${PN} += "libswscale.so.5.9 \
libswscale5-9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libavutil.so.56.70 \
libavutil56-70 \
libc.so.6 \
libm.so.6"

inherit rpm
