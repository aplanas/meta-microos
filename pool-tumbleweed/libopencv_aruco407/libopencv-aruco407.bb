SUMMARY = "Pattern grid detection libraries for OpenCV"
DESCRIPTION = "Pattern grid detectiion libraries for OpenCV"
LICENSE = "BSD-3-Clause"

PV = "4.7.0"

RPM_NAME = "libopencv_aruco407-4.7.0-1.8.aarch64.rpm"
RPM_HASH = "4effc8d34c1498a77f47ca9a0f1a6e9468a90915ca94d7fea29744c6f36b3c3f500e149efe5af9d5c1e725f5d2c8b438c633b7b34dc494890c6f6f8719280e57"

RPROVIDES:${PN} += "libopencv-aruco.so.407 \
libopencv-aruco407"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libopencv-calib3d.so.407 \
libopencv-core.so.407 \
libopencv-imgproc.so.407 \
libopencv-objdetect.so.407 \
libstdc++.so.6"

inherit rpm
