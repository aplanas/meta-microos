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

RPM_NAME = "vtk-openmpi3-devel-9.2.6-2.5.aarch64.rpm"
RPM_HASH = "5b9ce803ba98c243636f0d93cd6dc646a6b7912a51f703f12a396a4f92d61389e53db56dd67dabcc1517bd2d7183029c7453a8f0ad72684ca013d8603cc7d5e8"

RPROVIDES:${PN} += "vtk-openmpi3-devel"

RDEPENDS:${PN} += "cgns-devel \
cmake \
cmake-Verdict \
cmake-nlohmann-json \
double-conversion-devel \
gcc-c++ \
gl2ps-devel \
hdf5-devel \
hdf5-openmpi3-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libjpeg-devel \
libmysqlclient-devel \
libnetcdf-c++-devel \
libtiff-devel \
libvtk1-openmpi3 \
libvtkWrappingTools.so.1 \
openmpi3 \
openmpi3-devel \
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
python3-vtk-openmpi3 \
utfcpp-devel \
vtk-openmpi3-qt"

inherit rpm
