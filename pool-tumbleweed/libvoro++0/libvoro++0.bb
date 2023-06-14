SUMMARY = "Voronoi tessellation library"
DESCRIPTION = "Voro++ is a software library for carrying out three-dimensional computations \
of the Voronoi tessellation. A distinguishing feature of the Voro++ library \
is that it carries out cell-based calculations, computing the Voronoi cell for \
each particle individually. It is particularly well-suited for applications that \
rely on cell-based statistics, where features of Voronoi cells (e.g. volume, \
centroid, number of faces) can be used to analyze a system of particles. \
 \
This package contains the voro++ library."
LICENSE = "BSD-3-Clause"

PV = "0.4.6"

RPM_NAME = "libvoro++0-0.4.6-1.24.aarch64.rpm"
RPM_HASH = "7737a7dc9320fa1c7afc770423d0a4287b015698b93b08dc6a7ef2443a511de2b645582972bc4fda92e0c57fc66a5e166eaabcf807da5ca518e65f61a0ea8c5a"

RPROVIDES:${PN} += "libvoro++.so.0 \
libvoro++0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
