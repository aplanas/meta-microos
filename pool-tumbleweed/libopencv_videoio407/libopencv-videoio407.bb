SUMMARY = "Video IO libraries for OpenCV"
DESCRIPTION = "Video IO libraries for OpenCV"
LICENSE = "BSD-3-Clause"

PV = "4.7.0"

RPM_NAME = "libopencv_videoio407-4.7.0-1.6.aarch64.rpm"
RPM_HASH = "0a490b94295ff62d2e27ff4c6e408b4f1eebf7fd2d7976d95a950b8655c984e317dfe7cf8a85a90fa9d2f3d5aec8222313babf98169aec522db3887a17311f01"

RPROVIDES:${PN} += "libopencv-videoio.so.407 \
libopencv-videoio407"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libavcodec.so.60 \
libavformat.so.60 \
libavutil.so.58 \
libc.so.6 \
libdc1394.so.25 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstapp-1.0.so.0 \
libgstaudio-1.0.so.0 \
libgstbase-1.0.so.0 \
libgstpbutils-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgstriff-1.0.so.0 \
libgstvideo-1.0.so.0 \
libm.so.6 \
libopencv-core.so.407 \
libopencv-imgcodecs.so.407 \
libopencv-imgproc.so.407 \
libstdc++.so.6 \
libswscale.so.7"

inherit rpm
