SUMMARY = "Development files for ITK"
DESCRIPTION = "The Insight Toolkit (ITK) is a toolkit for N-dimensional scientific \
image processing, segmentation, and registration. \
 \
This package provides development files for the ITK library."
LICENSE = "Apache-2.0"

PV = "5.3.0"

RPM_NAME = "insighttoolkit-devel-5.3.0-3.2.aarch64.rpm"
RPM_HASH = "2b5adb7d19ab74e5bde1170bd422179391b63228b1e754c09dfa659110497412a290ebefab39f78f5a95bfcb73d1fc67499d2f217ef5faa4a0823c9d3bd93c95"

RPROVIDES:${PN} += "cmake(ITK) \
insighttoolkit-devel \
insighttoolkit-devel(aarch-64) \
libinsighttoolkit-devel"

RDEPENDS:${PN} += "dcmtk-devel \
double-conversion-devel \
fftw3-threads-devel \
hdf5-devel \
ld-linux-aarch64.so.1()(64bit) \
libITKCommon-5.3.so.1()(64bit) \
libITKTestKernel-5.3.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libinsighttoolkit5_3-1 \
libitksys-5.3.so.1()(64bit) \
libitkvnl-5.3.so.1()(64bit) \
libstdc++.so.6()(64bit) \
pkgconfig(expat) \
pkgconfig(fftw3) \
pkgconfig(libjpeg) \
pkgconfig(libpcrecpp) \
pkgconfig(libpng) \
pkgconfig(libtiff-4) \
pkgconfig(libxml-2.0) \
pkgconfig(zlib) \
vtk-devel"

inherit rpm
