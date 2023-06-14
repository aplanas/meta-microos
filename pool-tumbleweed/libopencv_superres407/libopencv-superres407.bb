SUMMARY = "Superresolution libraries for OpenCV"
DESCRIPTION = "Superresolution libraries for OpenCV"
LICENSE = "BSD-3-Clause"

PV = "4.7.0"

RPM_NAME = "libopencv_superres407-4.7.0-1.6.aarch64.rpm"
RPM_HASH = "272554cbdec201bf5f3c0deb61c70ae541f0e805759a11f595fb474cb9975cde9fe100c9c3922882b694a380d45613cb71b245ab17be1d8a3cc1d80a5fb953ef"

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
