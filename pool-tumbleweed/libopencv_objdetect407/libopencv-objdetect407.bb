SUMMARY = "Face detection libraries for OpenCV"
DESCRIPTION = "Object detection libraries for OpenCV"
LICENSE = "BSD-3-Clause"

PV = "4.7.0"

RPM_NAME = "libopencv_objdetect407-4.7.0-1.6.aarch64.rpm"
RPM_HASH = "a72f131dd1d67fbdd102e0253fda5b8eb24d0b06ada79186922d6d317cd897e6b4333fd43d6a33619adfac99eff5e9e936e3bfe73664c6ba7b379f170e8d6902"

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
