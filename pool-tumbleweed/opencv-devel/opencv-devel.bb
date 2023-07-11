SUMMARY = "Development files for using the OpenCV library"
DESCRIPTION = "This package contains the OpenCV C/C++ library and header files, as well as \
documentation. It should be installed if you want to develop programs that will \
use the OpenCV library."
LICENSE = "BSD-3-Clause"

PV = "4.7.0"

RPM_NAME = "opencv-devel-4.7.0-1.8.aarch64.rpm"
RPM_HASH = "9aea654b162902a13e67b9d2b81c0e6b6a1d6845e4ead90765b0caa2b9d5dcbfe0b6c6565b6497644f821a1f0d92240ba5589d080120257287da8e667743f3da"

RPROVIDES:${PN} += "cmake-OpenCV \
opencv-devel \
opencv-qt5-devel \
pkgconfig-opencv4"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libopencv-aruco407 \
libopencv-face407 \
libopencv-gapi407 \
libopencv-highgui407 \
libopencv-imgcodecs407 \
libopencv-objdetect407 \
libopencv-optflow407 \
libopencv-superres407 \
libopencv-videoio407 \
libopencv-videostab407 \
libopencv-ximgproc407 \
libopencv407 \
opencv \
pkgconfig-gl \
pkgconfig-glu \
pkgconfig-ice \
pkgconfig-sm \
pkgconfig-x11 \
pkgconfig-xext"

inherit rpm
