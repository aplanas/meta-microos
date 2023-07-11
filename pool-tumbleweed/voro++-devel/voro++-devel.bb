SUMMARY = "Development headers and libraries for voro++"
DESCRIPTION = "Voro++ is a software library for carrying out three-dimensional computations \
of the Voronoi tessellation. A distinguishing feature of the Voro++ library \
is that it carries out cell-based calculations, computing the Voronoi cell for \
each particle individually. It is particularly well-suited for applications that \
rely on cell-based statistics, where features of Voronoi cells (e.g. volume, \
centroid, number of faces) can be used to analyze a system of particles. \
 \
This package contains development headers and libraries for voro++."
LICENSE = "BSD-3-Clause"

PV = "0.4.6"

RPM_NAME = "voro++-devel-0.4.6-1.25.aarch64.rpm"
RPM_HASH = "95168aa1b8178a3d361ea64e430affd60be7c7ea2ddf0e4270302b5708f68863673877b1f332e078227a54330a57534a07e3ec61483842c1691f1b481aa60b5e"

RPROVIDES:${PN} += "voro++-devel"

RDEPENDS:${PN} += "libvoro++0"

inherit rpm
