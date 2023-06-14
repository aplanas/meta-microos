SUMMARY = "G-API library component for OpenCV"
DESCRIPTION = "G-API library component for OpenCV"
LICENSE = "BSD-3-Clause"

PV = "4.7.0"

RPM_NAME = "libopencv_gapi407-4.7.0-1.6.aarch64.rpm"
RPM_HASH = "436df6af8c152a77180e78da0aa7192aea97b923ee31213421c106d2fe6ea05c8a814b99481b8c016313f0ba99513cca35e64fce80c9c9ad63140d12f7972e05"

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
