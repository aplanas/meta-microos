SUMMARY = "Libraries and header files for the MathGL library"
DESCRIPTION = "MathGL is a library for making scientific graphics. It provides data \
plotting and handling of large data arrays, as well as window and \
console modes and for embedding into other programs. \
 \
This package contains libraries and header files for developing \
applications that use MathGL."
LICENSE = "GPL-3.0-only"

PV = "8.0.1"

RPM_NAME = "mathgl-devel-8.0.1-4.2.aarch64.rpm"
RPM_HASH = "2910f93cb56ad436a4fc5c3ef4386b44bf52567bf219f88d6f26415f30bc4e34b6bf468e97d2cb51f6f09e1da52d3ff18cfd8e4aa37e069d8bf05c07f4922d5f"

RPROVIDES:${PN} += "cmake-MathGL2 \
cmake-mathgl2 \
mathgl-devel"

RDEPENDS:${PN} += "cmake \
libmgl-fltk8 \
libmgl-glut8 \
libmgl-mpi8 \
libmgl-qt5-8 \
libmgl-wnd8 \
libmgl-wx8 \
libmgl8"

inherit rpm
