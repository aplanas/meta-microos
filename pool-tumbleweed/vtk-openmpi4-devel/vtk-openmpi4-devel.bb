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

RPM_NAME = "vtk-openmpi4-devel-9.2.6-2.2.aarch64.rpm"
RPM_HASH = "13989fb362690845078e69de82d262d810ab8a160242258cfeee952249c51f15a781d1857035ebe587fe867069c326cb765e775ff4ea50c6d5e1c0f5916ebd76"

RPROVIDES:${PN} += "vtk-openmpi4-devel \
vtk-openmpi4-devel(aarch-64)"

RDEPENDS:${PN} += "cgns-devel \
cmake \
cmake(Verdict) \
cmake(nlohmann_json) \
double-conversion-devel \
gcc-c++ \
gl2ps-devel \
hdf5-devel \
hdf5-openmpi4-devel \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libjpeg-devel \
libmysqlclient-devel \
libnetcdf_c++-devel \
libtiff-devel \
libvtk1-openmpi4 \
libvtkWrappingTools.so.1()(64bit) \
openmpi4 \
openmpi4-devel \
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
python3-vtk-openmpi4 \
utfcpp-devel \
vtk-openmpi4-qt"

inherit rpm
