SUMMARY = "Development files for ITK"
DESCRIPTION = "The Insight Toolkit (ITK) is a toolkit for N-dimensional scientific \
image processing, segmentation, and registration. \
 \
This package provides development files for the ITK library."
LICENSE = "Apache-2.0"

PV = "5.3.0"

RPM_NAME = "insighttoolkit-devel-5.3.0-3.3.aarch64.rpm"
RPM_HASH = "1b758c5d3a5dbe0c378694631219f67f35cc84f5a1c69037f5c058d7c85ff943a5fdb75b9867a3a317be8a714578399a179621cc6b313191c2ea104a67e13efb"

RPROVIDES:${PN} += "cmake-ITK \
insighttoolkit-devel \
libinsighttoolkit-devel"

RDEPENDS:${PN} += "dcmtk-devel \
double-conversion-devel \
fftw3-threads-devel \
hdf5-devel \
ld-linux-aarch64.so.1 \
libITKCommon-5.3.so.1 \
libITKTestKernel-5.3.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libinsighttoolkit5-3-1 \
libitksys-5.3.so.1 \
libitkvnl-5.3.so.1 \
libstdc++.so.6 \
pkgconfig-expat \
pkgconfig-fftw3 \
pkgconfig-libjpeg \
pkgconfig-libpcrecpp \
pkgconfig-libpng \
pkgconfig-libtiff-4 \
pkgconfig-libxml-2.0 \
pkgconfig-zlib \
vtk-devel"

inherit rpm
