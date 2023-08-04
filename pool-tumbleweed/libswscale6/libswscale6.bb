SUMMARY = "FFmpeg image scaling and colorspace/pixel conversion library"
DESCRIPTION = "The libswscale library performs image scaling and colorspace and \
pixel format conversion operations."
LICENSE = "GPL-3.0-or-later"

PV = "5.1.3"

RPM_NAME = "libswscale6-5.1.3-2.2.aarch64.rpm"
RPM_HASH = "62025ae66f9bd5ee5b587e222ebfffbf0a9ed225d3ce1639c71dd5ab61bf23d49fae395d418b59d28face1aff00b8a96f0f212e2994e51f79b64d500587c5f10"

RPROVIDES:${PN} += "libswscale.so.6 \
libswscale6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libavutil.so.57 \
libavutil57 \
libc.so.6 \
libm.so.6"

inherit rpm
