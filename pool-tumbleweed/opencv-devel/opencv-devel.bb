SUMMARY = "Development files for using the OpenCV library"
DESCRIPTION = "This package contains the OpenCV C/C++ library and header files, as well as \
documentation. It should be installed if you want to develop programs that will \
use the OpenCV library."
LICENSE = "BSD-3-Clause"

PV = "4.7.0"

RPM_NAME = "opencv-devel-4.7.0-1.6.aarch64.rpm"
RPM_HASH = "afd642423de1b59b4899e5599fc756e0f5af94c3ec40d76f59818c397301235b58a1da4ec592025bcb7a04a4ed03451213c602ce45c106d6c8963e898ea72a1d"

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
