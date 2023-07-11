SUMMARY = "Collection of algorithms for computer vision"
DESCRIPTION = "OpenCV means Intel Open Source Computer Vision Library. It is a collection of C \
functions and a few C++ classes that implement some popular Image Processing and \
Computer Vision algorithms."
LICENSE = "Apache-2.0 & BSD-3-Clause & GPL-2.0-only"

PV = "3.4.19"

RPM_NAME = "opencv3-3.4.19-1.3.aarch64.rpm"
RPM_HASH = "a1767b8e1b767e6394f23e067747f80da5a6de0b17f6e51408a3fd478442108caceeb1899259c80ce856bb3137c018171019abe5b20c3ea6a110ae26ffec3b66"

RPROVIDES:${PN} += "opencv-qt5 \
opencv3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libopencv-calib3d.so.3.4 \
libopencv-core.so.3.4 \
libopencv-features2d.so.3.4 \
libopencv-highgui.so.3.4 \
libopencv-imgcodecs.so.3.4 \
libopencv-imgproc.so.3.4 \
libopencv-videoio.so.3.4 \
libstdc++.so.6"

inherit rpm
