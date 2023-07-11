SUMMARY = "Face detection libraries for OpenCV"
DESCRIPTION = "Object detection libraries for OpenCV"
LICENSE = "BSD-3-Clause"

PV = "4.7.0"

RPM_NAME = "libopencv_objdetect407-4.7.0-1.8.aarch64.rpm"
RPM_HASH = "ce524ed2853d28ab7b1e11d65cca4ec22178fab3a74e8ee51f6db8eb8169b5ddf298c3e07809aa6d95eee8aa4c6ef382db93c013617f5ef6f53536723b50fd4d"

RPROVIDES:${PN} += "libopencv-objdetect.so.407 \
libopencv-objdetect407"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libopencv-calib3d.so.407 \
libopencv-core.so.407 \
libopencv-dnn.so.407 \
libopencv-imgproc.so.407 \
libstdc++.so.6 \
opencv4-cascades-data"

inherit rpm
