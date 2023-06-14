SUMMARY = "Video stabilization libraries for OpenCV"
DESCRIPTION = "Video stabilization libraries for OpenCV"
LICENSE = "BSD-3-Clause"

PV = "4.7.0"

RPM_NAME = "libopencv_videostab407-4.7.0-1.6.aarch64.rpm"
RPM_HASH = "3c29a388ba0d2c32135cb4b86b550e32cd9b69cb07f61e0aecd23b6c1e6eb60d421d0653aee40e07a15783ece50cb63ebca65553e8681481d0cc1c4adf239d72"

RPROVIDES:${PN} += "libopencv-videostab.so.407 \
libopencv-videostab407"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libopencv-calib3d.so.407 \
libopencv-core.so.407 \
libopencv-features2d.so.407 \
libopencv-imgproc.so.407 \
libopencv-photo.so.407 \
libopencv-video.so.407 \
libopencv-videoio.so.407 \
libstdc++.so.6"

inherit rpm
