SUMMARY = "Computing convex hulls, Delaunay triangulations and Voronoi diagrams"
DESCRIPTION = "Qhull computes the convex hull, Delaunay triangulation, Voronoi diagram, \
halfspace intersection about a point, furthest-site Delaunay triangulation, \
and furthest-site Voronoi diagram. The source code runs in 2D \
and higher dimensions. Qhull implements the Quickhull algorithm for computing \
the convex hull. It handles roundoff errors from floating point arithmetic. It \
computes volumes, surface areas, and approximations to the convex hull. \
 \
Qhull does not support constrained Delaunay triangulations, triangulation of \
non-convex surfaces, mesh generation of non-convex objects, or medium-sized \
inputs in 9-D and higher."
LICENSE = "Qhull"

PV = "2020.2"

RPM_NAME = "libqhull_r8_0-2020.2-3.6.aarch64.rpm"
RPM_HASH = "4d0d693fe3248d113fd6358587dfc4ceb146b5c8f2ef1b49c07c92eba0e32d0747c664d6e5f662797d5deb291705dc97f443bd0888d6b12bc55ee82b6f24e42b"

RPROVIDES:${PN} += "libqhull-r.so.8.0 \
libqhull-r8-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
