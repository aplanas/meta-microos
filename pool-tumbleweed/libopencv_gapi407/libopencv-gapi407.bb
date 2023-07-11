SUMMARY = "G-API library component for OpenCV"
DESCRIPTION = "G-API library component for OpenCV"
LICENSE = "BSD-3-Clause"

PV = "4.7.0"

RPM_NAME = "libopencv_gapi407-4.7.0-1.8.aarch64.rpm"
RPM_HASH = "a626b73a70f0f5153ad3f537bdf701d357621b8ec2d61d89bab196040a29ada796d5f3a2b785dddae1ac7d6354b7a0f2c11e5b48354dfa569caccfc74556cdb9"

RPROVIDES:${PN} += "libopencv-gapi.so.407 \
libopencv-gapi407"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstapp-1.0.so.0 \
libgstpbutils-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgstvideo-1.0.so.0 \
libm.so.6 \
libopencv-calib3d.so.407 \
libopencv-core.so.407 \
libopencv-imgproc.so.407 \
libopencv-video.so.407 \
libstdc++.so.6 \
libtbb.so.12"

inherit rpm
