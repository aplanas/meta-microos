SUMMARY = "Video IO libraries for OpenCV"
DESCRIPTION = "Video IO libraries for OpenCV"
LICENSE = "BSD-3-Clause"

PV = "4.7.0"

RPM_NAME = "libopencv_videoio407-4.7.0-1.6.aarch64.rpm"
RPM_HASH = "0a490b94295ff62d2e27ff4c6e408b4f1eebf7fd2d7976d95a950b8655c984e317dfe7cf8a85a90fa9d2f3d5aec8222313babf98169aec522db3887a17311f01"

RPROVIDES:${PN} += "libopencv_videoio.so.407()(64bit) \
libopencv_videoio407 \
libopencv_videoio407(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libavcodec.so.60()(64bit) \
libavformat.so.60()(64bit) \
libavutil.so.58()(64bit) \
libc.so.6()(64bit) \
libdc1394.so.25()(64bit) \
libgcc_s.so.1()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgstapp-1.0.so.0()(64bit) \
libgstaudio-1.0.so.0()(64bit) \
libgstbase-1.0.so.0()(64bit) \
libgstpbutils-1.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
libgstriff-1.0.so.0()(64bit) \
libgstvideo-1.0.so.0()(64bit) \
libm.so.6()(64bit) \
libopencv_core.so.407()(64bit) \
libopencv_imgcodecs.so.407()(64bit) \
libopencv_imgproc.so.407()(64bit) \
libstdc++.so.6()(64bit) \
libswscale.so.7()(64bit)"

inherit rpm
