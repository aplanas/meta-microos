SUMMARY = "Image codec libraries for OpenCV"
DESCRIPTION = "Image codec libraries for OpenCV"
LICENSE = "BSD-3-Clause"

PV = "4.7.0"

RPM_NAME = "libopencv_imgcodecs407-4.7.0-1.6.aarch64.rpm"
RPM_HASH = "1fda81e23d65d088024452be174d0f35ef136d050b8df51bf5441e108794a59150a0fd1015375c2af24e9d0228b3c0a492f829a04e521c8b45b4154d21b8bb29"

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
