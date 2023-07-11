SUMMARY = "Face detection libraries for OpenCV"
DESCRIPTION = "Face detection libraries for OpenCV"
LICENSE = "BSD-3-Clause"

PV = "4.7.0"

RPM_NAME = "libopencv_face407-4.7.0-1.8.aarch64.rpm"
RPM_HASH = "19990f9d9f334d3813efeaccd30cb55be8a188ff436aeace3f0c4e2e1cadc9364a6dee2086b1d47b0cbe0d305ada0c40354de7836bfe9835b8aee0ab3de1369c"

RPROVIDES:${PN} += "libopencv-face.so.407 \
libopencv-face407"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libopencv-calib3d.so.407 \
libopencv-core.so.407 \
libopencv-imgproc.so.407 \
libopencv-objdetect.so.407 \
libstdc++.so.6 \
opencv4-cascades-data"

inherit rpm
