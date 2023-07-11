SUMMARY = "Image codec libraries for OpenCV"
DESCRIPTION = "Image codec libraries for OpenCV"
LICENSE = "BSD-3-Clause"

PV = "4.7.0"

RPM_NAME = "libopencv_imgcodecs407-4.7.0-1.8.aarch64.rpm"
RPM_HASH = "67ed22c7982a772c86a6b627f5366441090f271986312d6c2952b8da221f111b7835c3fedc611fc55cb99118db05867c426a7b7a0b4b0098415665ac2346b68e"

RPROVIDES:${PN} += "libopencv-imgcodecs.so.407 \
libopencv-imgcodecs407"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libOpenEXR-3-1.so.30 \
libc.so.6 \
libgcc-s.so.1 \
libjpeg.so.8 \
libm.so.6 \
libopencv-core.so.407 \
libopencv-imgproc.so.407 \
libopenjp2.so.7 \
libpng16.so.16 \
libstdc++.so.6 \
libtiff.so.6 \
libwebp.so.7"

inherit rpm
