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

RPM_NAME = "vtk-devel-9.2.6-2.2.aarch64.rpm"
RPM_HASH = "d72aa468a0252e01ab6a565e596f0845f5e60be0b551d55282a5ce87c343e70a354fa2a24d46bf76a2e3d7c770bd0166cbfc2b54cac6d7f864582e2dc950203d"

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
