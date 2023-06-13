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

RPM_NAME = "vtk-openmpi2-devel-9.2.6-2.2.aarch64.rpm"
RPM_HASH = "0b1d840162d99f2717895b32619e13ec3f6359d14874decd5888ba341e83ede680cd1d483af33080e19e150d52ef5947fa67529d507e0852820db358bfb4f733"

RPROVIDES:${PN} += "vtk-openmpi2-devel \
vtk-openmpi2-devel(aarch-64)"

RDEPENDS:${PN} += "cgns-devel \
cmake \
cmake(Verdict) \
cmake(nlohmann_json) \
double-conversion-devel \
gcc-c++ \
gl2ps-devel \
hdf5-devel \
hdf5-openmpi2-devel \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libjpeg-devel \
libmysqlclient-devel \
libnetcdf_c++-devel \
libtiff-devel \
libvtk1-openmpi2 \
libvtkWrappingTools.so.1()(64bit) \
openmpi2 \
openmpi2-devel \
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
python3-vtk-openmpi2 \
utfcpp-devel \
vtk-openmpi2-qt"

inherit rpm
