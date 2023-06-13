SUMMARY = "Face detection libraries for OpenCV"
DESCRIPTION = "Face detection libraries for OpenCV"
LICENSE = "BSD-3-Clause"

PV = "4.7.0"

RPM_NAME = "libopencv_face407-4.7.0-1.6.aarch64.rpm"
RPM_HASH = "ee02cfe8c8204f2bf806e4dfda1ce535e65c324ecc3cf11b4438aceac78a7a78204a34c3fa1e05a3a488044c78ac142d5b3a851c2da064b2867350520fc36b63"

RPROVIDES:${PN} += "libopencv_face.so.407()(64bit) \
libopencv_face407 \
libopencv_face407(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libopencv_calib3d.so.407()(64bit) \
libopencv_core.so.407()(64bit) \
libopencv_imgproc.so.407()(64bit) \
libopencv_objdetect.so.407()(64bit) \
libstdc++.so.6()(64bit) \
opencv4-cascades-data"

inherit rpm
