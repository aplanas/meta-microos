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

RPM_NAME = "qhull-2020.2-3.5.aarch64.rpm"
RPM_HASH = "5aa30ce4f5f844b4b02c71d72be4854818c9706203614f9382f92efc446f5ed7ae23235ffe3da557e5a6adbed8c6077bfdff9ca9776a57dc564199387bd4c842"

RPROVIDES:${PN} += "qhull \
qhull(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libqhull_r.so.8.0()(64bit)"

inherit rpm
