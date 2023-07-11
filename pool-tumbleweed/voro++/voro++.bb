SUMMARY = "Voronoi tessellation library"
DESCRIPTION = "Voro++ is a software library for carrying out three-dimensional computations \
of the Voronoi tessellation. A distinguishing feature of the Voro++ library \
is that it carries out cell-based calculations, computing the Voronoi cell for \
each particle individually. It is particularly well-suited for applications that \
rely on cell-based statistics, where features of Voronoi cells (e.g. volume, \
centroid, number of faces) can be used to analyze a system of particles."
LICENSE = "BSD-3-Clause"

PV = "0.4.6"

RPM_NAME = "voro++-0.4.6-1.25.aarch64.rpm"
RPM_HASH = "6d0c2fcf54a412789be43d4a0e3e1171dc4fed4b71f46ea6e078f9ea3482615d19ba4f0acf16bda3fd24dc5af25f7f4501405be77b513a58567a1759c1adc2d3"

RPROVIDES:${PN} += "voro++"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libvoro++.so.0"

inherit rpm
