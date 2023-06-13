SUMMARY = "Development files for using the OpenCV library"
DESCRIPTION = "This package contains the OpenCV C/C++ library and header files, as well as \
documentation. It should be installed if you want to develop programs that will \
use the OpenCV library."
LICENSE = "BSD-3-Clause"

PV = "3.4.19"

RPM_NAME = "opencv3-devel-3.4.19-1.1.aarch64.rpm"
RPM_HASH = "1e111776fb6ea57218c0dbe74d1b6814fd270265d65758f648838fb068e862370120a27ab216ba7249e3c56f3724904f2bc2b88b8fb4c139e6456d8aea0e36e7"

RPROVIDES:${PN} += "opencv-qt5-devel \
opencv3-devel \
opencv3-devel(aarch-64) \
pkgconfig(opencv)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libopencv3_4 \
opencv3 \
pkgconfig(gl) \
pkgconfig(glu) \
pkgconfig(ice) \
pkgconfig(sm) \
pkgconfig(x11) \
pkgconfig(xext)"

inherit rpm
