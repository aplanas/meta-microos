SUMMARY = "FFmpeg image scaling and colorspace/pixel conversion library"
DESCRIPTION = "The libswscale library performs image scaling and colorspace and \
pixel format conversion operations."
LICENSE = "GPL-3.0-or-later"

PV = "6.0"

RPM_NAME = "libswscale7-6.0-3.1.aarch64.rpm"
RPM_HASH = "7a39aa5852c3a779fa2b0e3360da3827acbd42351eabd66f99a7e29054744ed1e9c78396f84c2edd9004640773c4d509d302d25d54a98af08c470f78809bfa22"

RPROVIDES:${PN} += "libswscale.so.7 \
libswscale7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libavutil.so.58 \
libavutil58 \
libc.so.6 \
libm.so.6"

inherit rpm
