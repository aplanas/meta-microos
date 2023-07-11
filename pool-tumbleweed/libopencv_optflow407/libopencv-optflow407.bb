SUMMARY = "Optical flow calculation libraries for OpenCV"
DESCRIPTION = "Optical flow calculation libraries for OpenCV"
LICENSE = "BSD-3-Clause"

PV = "4.7.0"

RPM_NAME = "libopencv_optflow407-4.7.0-1.8.aarch64.rpm"
RPM_HASH = "9df9bfdf780943114bb6ee6156b3d6fee92c1ca13e101a8877cb4648989d4ea9c1e9e92aa011de9b76a8d2ab9eda1a1f1f4fdc5dbebaa2321d4a3226ec261b64"

RPROVIDES:${PN} += "libopencv-optflow.so.407 \
libopencv-optflow407"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libopencv-calib3d.so.407 \
libopencv-core.so.407 \
libopencv-flann.so.407 \
libopencv-imgcodecs.so.407 \
libopencv-imgproc.so.407 \
libopencv-video.so.407 \
libopencv-ximgproc.so.407 \
libstdc++.so.6"

inherit rpm
