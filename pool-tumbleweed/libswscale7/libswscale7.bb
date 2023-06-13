SUMMARY = "FFmpeg image scaling and colorspace/pixel conversion library"
DESCRIPTION = "The libswscale library performs image scaling and colorspace and \
pixel format conversion operations."
LICENSE = "GPL-3.0-or-later"

PV = "6.0"

RPM_NAME = "libswscale7-6.0-2.2.aarch64.rpm"
RPM_HASH = "8d28f005818f27cdfaf961100d99dc4072d71684e5c4f856459bc322cdd8c5cd8379dcfb6a382d48a4517ea70d4b00ac8943b8fec27d1685ef5abf64da8dbc64"

RPROVIDES:${PN} += "libswscale.so.7()(64bit) \
libswscale7 \
libswscale7(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libavutil.so.58()(64bit) \
libavutil58 \
libc.so.6()(64bit) \
libm.so.6()(64bit)"

inherit rpm
