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

RPM_NAME = "vtk-openmpi3-devel-9.2.6-2.2.aarch64.rpm"
RPM_HASH = "54aa34ab5aa21ba6bac0cb511f453802ce6adcd4bc72c8c4ee1b36287b6f283afd71e7b5bf6bf9f64b006a56dfc9725d2e3a8da5b9bbee381b4281054457dc99"

RPROVIDES:${PN} += "vtk-openmpi3-devel \
vtk-openmpi3-devel(aarch-64)"

RDEPENDS:${PN} += "cgns-devel \
cmake \
cmake(Verdict) \
cmake(nlohmann_json) \
double-conversion-devel \
gcc-c++ \
gl2ps-devel \
hdf5-devel \
hdf5-openmpi3-devel \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libjpeg-devel \
libmysqlclient-devel \
libnetcdf_c++-devel \
libtiff-devel \
libvtk1-openmpi3 \
libvtkWrappingTools.so.1()(64bit) \
openmpi3 \
openmpi3-devel \
pkgconfig(Qt5Core) \
pkgconfig(Qt5OpenGL) \
pkgconfig(Qt5OpenGLExtensions) \
pkgconfig(Qt5Sql) \
pkgconfig(Qt5Widgets) \
pkgconfig(expat) \
pkgconfig(freetype2) \
pkgconfig(gl) \
pkgconfig(jsoncpp) \
pkgconfig(libavcodec) \
pkgconfig(libavdevice) \
pkgconfig(libavformat) \
pkgconfig(libavutil) \
pkgconfig(libiodbc) \
pkgconfig(liblz4) \
pkgconfig(liblzma) \
pkgconfig(libpng) \
pkgconfig(libswscale) \
pkgconfig(netcdf) \
pkgconfig(pugixml) \
pkgconfig(theora) \
pkgconfig(zlib) \
python3-vtk-openmpi3 \
utfcpp-devel \
vtk-openmpi3-qt"

inherit rpm
