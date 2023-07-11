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

RPM_NAME = "vtk-openmpi4-devel-9.2.6-2.5.aarch64.rpm"
RPM_HASH = "0f0355ab8aeba90bb1060388f1b719df1b1bf7511b741f772adc26a40a757d7857563562dd6fd6244274bb07cf2b5fd67bcedef72983a7d9a0811a27a3eed447"

RPROVIDES:${PN} += "vtk-openmpi4-devel"

RDEPENDS:${PN} += "cgns-devel \
cmake \
cmake-Verdict \
cmake-nlohmann-json \
double-conversion-devel \
gcc-c++ \
gl2ps-devel \
hdf5-devel \
hdf5-openmpi4-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libjpeg-devel \
libmysqlclient-devel \
libnetcdf-c++-devel \
libtiff-devel \
libvtk1-openmpi4 \
libvtkWrappingTools.so.1 \
openmpi4 \
openmpi4-devel \
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
python3-vtk-openmpi4 \
utfcpp-devel \
vtk-openmpi4-qt"

inherit rpm
