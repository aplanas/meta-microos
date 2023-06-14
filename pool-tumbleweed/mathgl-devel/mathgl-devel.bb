SUMMARY = "Libraries and header files for the MathGL library"
DESCRIPTION = "MathGL is a library for making scientific graphics. It provides data \
plotting and handling of large data arrays, as well as window and \
console modes and for embedding into other programs. \
 \
This package contains libraries and header files for developing \
applications that use MathGL."
LICENSE = "GPL-3.0-only"

PV = "8.0.1"

RPM_NAME = "mathgl-devel-8.0.1-3.3.aarch64.rpm"
RPM_HASH = "d1b970f9d44ca47a99872cec4bcc4c794d4a34af5f4689b21bde7d14d38998153865dce8d74e64ed9ea97ff5c2fd3e47fe91a9883e0f88ea90c9dce9d9fcd385"

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
