SUMMARY = "Image processing libraries for OpenCV"
DESCRIPTION = "Image processing libraries for OpenCV"
LICENSE = "BSD-3-Clause"

PV = "4.7.0"

RPM_NAME = "libopencv_ximgproc407-4.7.0-1.8.aarch64.rpm"
RPM_HASH = "a5e4b08e752df85e55c1feeefd8e090acc67197ce7c817a2258ceb348af4d79880b4e346454cff4b83cd6af56be079b10b36c8aad565e76f05cb192c308c037c"

RPROVIDES:${PN} += "libopencv-ximgproc.so.407 \
libopencv-ximgproc407"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libopencv-calib3d.so.407 \
libopencv-core.so.407 \
libopencv-imgcodecs.so.407 \
libopencv-imgproc.so.407 \
libopencv-video.so.407 \
libstdc++.so.6"

inherit rpm
