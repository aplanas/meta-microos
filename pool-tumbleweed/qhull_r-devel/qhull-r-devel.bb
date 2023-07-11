SUMMARY = "Development and documentation files for qhull"
DESCRIPTION = "Qhull computes the convex hull, Delaunay triangulation, Voronoi diagram, \
halfspace intersection about a point, furthest-site Delaunay triangulation, \
and furthest-site Voronoi diagram. \
 \
This package contains the header files for the Qhull libraries."
LICENSE = "Qhull"

PV = "2020.2"

RPM_NAME = "qhull_r-devel-2020.2-3.6.aarch64.rpm"
RPM_HASH = "689db9f3fe56fb75a227349ff8ac685e74a9fa577f15db8842251a9b9ff969cd50fea57f47812220659cf62f34323d4ca34190ac98d02ebaaaa8bd7738c4d84d"

RPROVIDES:${PN} += "cmake-Qhull \
pkgconfig-qhull-r \
qhull-devel \
qhull-r-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libqhull-r8-0"

inherit rpm
