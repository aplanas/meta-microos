SUMMARY = "Development and documentation files for qhull - C++ interface"
DESCRIPTION = "Qhull computes the convex hull, Delaunay triangulation, Voronoi diagram, \
halfspace intersection about a point, furthest-site Delaunay triangulation, \
and furthest-site Voronoi diagram. \
 \
This package contains the header files and static lib for Qhull's C++ interface."
LICENSE = "Qhull"

PV = "2020.2"

RPM_NAME = "qhullcpp-devel-static-2020.2-3.6.aarch64.rpm"
RPM_HASH = "cc314337c0cb7d275ac9e1af555d0dd9f323acd95644d6ffbf7b782936adedf67745fcb61a75a9461a5a1abade41e26ae47ad18d41cedb588e965c8bb5faa049"

RPROVIDES:${PN} += "pkgconfig-qhullcpp \
qhullcpp-devel-static"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libqhull-r8-0"

inherit rpm
