SUMMARY = "Video IO libraries for OpenCV"
DESCRIPTION = "Video IO libraries for OpenCV"
LICENSE = "BSD-3-Clause"

PV = "4.7.0"

RPM_NAME = "libopencv_videoio407-4.7.0-1.8.aarch64.rpm"
RPM_HASH = "7a51f8b220b0388bcc27b443ebd7bde8fed4e25481d8d7c3b91fa07bffd192fdcc9e108984fd5e7869c0776cbce14f4557cb836da1ab150915a00d8afa40a7c3"

RPROVIDES:${PN} += "libopencv-videoio.so.407 \
libopencv-videoio407"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libavcodec.so.60 \
libavformat.so.60 \
libavutil.so.58 \
libc.so.6 \
libdc1394.so.26 \
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
