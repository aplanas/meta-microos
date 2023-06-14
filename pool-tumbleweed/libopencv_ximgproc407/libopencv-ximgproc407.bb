SUMMARY = "Image processing libraries for OpenCV"
DESCRIPTION = "Image processing libraries for OpenCV"
LICENSE = "BSD-3-Clause"

PV = "4.7.0"

RPM_NAME = "libopencv_ximgproc407-4.7.0-1.6.aarch64.rpm"
RPM_HASH = "16071d83c00be6f60774d193373cd83aa3dd006c9e9bd01ac56addc8e1dc7ede9c200d0c6a386f36f0754f1a302feb731a38f6ac031ac39a373e64920c5d174e"

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
