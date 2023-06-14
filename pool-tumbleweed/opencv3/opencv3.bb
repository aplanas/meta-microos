SUMMARY = "Collection of algorithms for computer vision"
DESCRIPTION = "OpenCV means Intel Open Source Computer Vision Library. It is a collection of C \
functions and a few C++ classes that implement some popular Image Processing and \
Computer Vision algorithms."
LICENSE = "Apache-2.0 & BSD-3-Clause & GPL-2.0-only"

PV = "3.4.19"

RPM_NAME = "opencv3-3.4.19-1.1.aarch64.rpm"
RPM_HASH = "b50afaadef0b686fb2a2c66514416309c49b12af339e8e883eb9e50ab5e75a62a87a206c32fd13bbafa22de192091888218d9f0537c19716d993a435e6e68506"

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
