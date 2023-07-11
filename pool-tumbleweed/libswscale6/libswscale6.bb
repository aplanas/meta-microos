SUMMARY = "FFmpeg image scaling and colorspace/pixel conversion library"
DESCRIPTION = "The libswscale library performs image scaling and colorspace and \
pixel format conversion operations."
LICENSE = "GPL-3.0-or-later"

PV = "5.1.3"

RPM_NAME = "libswscale6-5.1.3-2.1.aarch64.rpm"
RPM_HASH = "278345e69160a5ce9648aeb122c0c7afbd977f9d487ff331b8991835ab163951178421640c4b61cb480a368e973a719cafcadd88f3930f913735924baeef1e49"

RPROVIDES:${PN} += "libswscale.so.6 \
libswscale6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libavutil.so.57 \
libavutil57 \
libc.so.6 \
libm.so.6"

inherit rpm
