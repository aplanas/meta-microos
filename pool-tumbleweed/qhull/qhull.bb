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

RPM_NAME = "qhull-2020.2-3.6.aarch64.rpm"
RPM_HASH = "2c0258b8873beb85f3eb0e85b9a0116af108a7f1364bb3c07b9edc2c9c955dd8a078c29b5d6fd6b512c1c8a17d027741f5dcf7fcfe808be7ac8cd4644ab068bf"

RPROVIDES:${PN} += "qhull"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libqhull-r.so.8.0"

inherit rpm
