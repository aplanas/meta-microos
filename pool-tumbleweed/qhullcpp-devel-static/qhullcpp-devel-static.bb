SUMMARY = "Development and documentation files for qhull - C++ interface"
DESCRIPTION = "Qhull computes the convex hull, Delaunay triangulation, Voronoi diagram, \
halfspace intersection about a point, furthest-site Delaunay triangulation, \
and furthest-site Voronoi diagram. \
 \
This package contains the header files and static lib for Qhull's C++ interface."
LICENSE = "Qhull"

PV = "2020.2"

RPM_NAME = "qhullcpp-devel-static-2020.2-3.5.aarch64.rpm"
RPM_HASH = "1c80a8d8ef7f4ae60d86943029acd603772611e447d1868fa6af953bdb80520937cc6a7a26b645fa98630bd25a79c30f2398738c774e9f4f0b883107fe298f84"

RPROVIDES:${PN} += "pkgconfig(qhullcpp) \
qhullcpp-devel-static \
qhullcpp-devel-static(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libqhull_r8_0"

inherit rpm
