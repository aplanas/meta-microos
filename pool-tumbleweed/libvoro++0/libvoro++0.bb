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

RPM_NAME = "libvoro++0-0.4.6-1.25.aarch64.rpm"
RPM_HASH = "9dda3389f929d579815efb29740582aa5892aeab7ee51d87525252973c349f327cce8f804017c7622b5b6b044973218f89b4385cfe1f79e6368089a762a7adf8"

RPROVIDES:${PN} += "libvoro++.so.0 \
libvoro++0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
