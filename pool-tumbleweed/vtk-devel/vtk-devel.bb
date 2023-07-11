SUMMARY = "VTK header files for building C++ code"
DESCRIPTION = "VTK is a software system for image processing, 3D graphics, volume \
rendering and visualization. VTK includes many advanced algorithms \
(e.g. surface reconstruction, implicit modelling, decimation) and \
rendering techniques (e.g. hardware-accelerated volume rendering, \
LOD control). \
 \
This provides development libraries and header files required to \
compile C++ programs that use VTK to do 3D visualisation."
LICENSE = "BSD-3-Clause"

PV = "9.2.6"

RPM_NAME = "vtk-devel-9.2.6-2.5.aarch64.rpm"
RPM_HASH = "98cf17722d4ebdd4a735f3aac887f988800799f400f2331393e3888c5c9cc7736c906c591bae16f1fa338e396375338a041eb3837b48f80fdb3abb4226a5504a"

RPROVIDES:${PN} += "cmake-FindFont \
cmake-vtk \
vtk-devel"

RDEPENDS:${PN} += "cgns-devel \
cmake \
cmake-Verdict \
cmake-nlohmann-json \
double-conversion-devel \
gcc-c++ \
gl2ps-devel \
hdf5-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libjpeg-devel \
libmysqlclient-devel \
libnetcdf-c++-devel \
libtiff-devel \
libvtk1 \
libvtkWrappingTools.so.1 \
pkgconfig-Qt5Core \
pkgconfig-Qt5OpenGL \
pkgconfig-Qt5OpenGLExtensions \
pkgconfig-Qt5Sql \
pkgconfig-Qt5Widgets \
pkgconfig-expat \
pkgconfig-freetype2 \
pkgconfig-gl \
pkgconfig-jsoncpp \
pkgconfig-libavcodec \
pkgconfig-libavdevice \
pkgconfig-libavformat \
pkgconfig-libavutil \
pkgconfig-libiodbc \
pkgconfig-liblz4 \
pkgconfig-liblzma \
pkgconfig-libpng \
pkgconfig-libswscale \
pkgconfig-netcdf \
pkgconfig-pugixml \
pkgconfig-theora \
pkgconfig-zlib \
python3-vtk \
utfcpp-devel \
vtk-qt"

inherit rpm
