SUMMARY = "FFmpeg image scaling and colorspace/pixel conversion library"
DESCRIPTION = "The libswscale library performs image scaling and colorspace and \
pixel format conversion operations."
LICENSE = "GPL-3.0-or-later"

PV = "6.0"

RPM_NAME = "libswscale7-6.0-2.4.aarch64.rpm"
RPM_HASH = "2592c44d817de183aa0fb7c64a5d7952a1b72a967e7e561230bcc55c12469c78da5cf684ea028cd0ae8dbbf0c621efbfc7b5b44bdd4a4a39d4c7b601c22478f2"

RPROVIDES:${PN} += "libswscale.so.7 \
libswscale7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libavutil.so.58 \
libavutil58 \
libc.so.6 \
libm.so.6"

inherit rpm
