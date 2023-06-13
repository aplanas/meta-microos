SUMMARY = "G-API library component for OpenCV"
DESCRIPTION = "G-API library component for OpenCV"
LICENSE = "BSD-3-Clause"

PV = "4.7.0"

RPM_NAME = "libopencv_gapi407-4.7.0-1.6.aarch64.rpm"
RPM_HASH = "436df6af8c152a77180e78da0aa7192aea97b923ee31213421c106d2fe6ea05c8a814b99481b8c016313f0ba99513cca35e64fce80c9c9ad63140d12f7972e05"

RPROVIDES:${PN} += "libopencv_gapi.so.407()(64bit) \
libopencv_gapi407 \
libopencv_gapi407(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgstapp-1.0.so.0()(64bit) \
libgstpbutils-1.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
libgstvideo-1.0.so.0()(64bit) \
libm.so.6()(64bit) \
libopencv_calib3d.so.407()(64bit) \
libopencv_core.so.407()(64bit) \
libopencv_imgproc.so.407()(64bit) \
libopencv_video.so.407()(64bit) \
libstdc++.so.6()(64bit) \
libtbb.so.12()(64bit)"

inherit rpm
