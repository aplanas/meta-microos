SUMMARY = "Development files for using the OpenCV library"
DESCRIPTION = "This package contains the OpenCV C/C++ library and header files, as well as \
documentation. It should be installed if you want to develop programs that will \
use the OpenCV library."
LICENSE = "BSD-3-Clause"

PV = "3.4.19"

RPM_NAME = "opencv3-devel-3.4.19-1.3.aarch64.rpm"
RPM_HASH = "87be657bc00694dc4aa335900ed34eaba961f18c8d976b99dd36df0a5dbf0ff4d28212b2a5fbc2d7a740b543148dff1c5627aa5610412e8013b73927cc68c181"

RPROVIDES:${PN} += "opencv-qt5-devel \
opencv3-devel \
pkgconfig-opencv"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libopencv3-4 \
opencv3 \
pkgconfig-gl \
pkgconfig-glu \
pkgconfig-ice \
pkgconfig-sm \
pkgconfig-x11 \
pkgconfig-xext"

inherit rpm
