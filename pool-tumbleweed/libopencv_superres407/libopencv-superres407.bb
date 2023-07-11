SUMMARY = "Superresolution libraries for OpenCV"
DESCRIPTION = "Superresolution libraries for OpenCV"
LICENSE = "BSD-3-Clause"

PV = "4.7.0"

RPM_NAME = "libopencv_superres407-4.7.0-1.8.aarch64.rpm"
RPM_HASH = "e6e8f2239d06379846387c91d0637e62117a3547a8177b2169f30c8a631fc0f75efdc93df2f10dcda3339bef3af5aa58c2938ffb282d2e4f3410b0c0754d6c5d"

RPROVIDES:${PN} += "libopencv-superres.so.407 \
libopencv-superres407"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libopencv-core.so.407 \
libopencv-imgproc.so.407 \
libopencv-optflow.so.407 \
libopencv-video.so.407 \
libopencv-videoio.so.407 \
libstdc++.so.6"

inherit rpm
