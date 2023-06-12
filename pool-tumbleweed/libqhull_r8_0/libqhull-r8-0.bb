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

RPM_NAME = "libqhull_r8_0-2020.2-3.5.aarch64.rpm"
RPM_HASH = "8bd3a33a6055d26ee4c1791a34505f24dbcaeb0d83b3930780495e0a87ae865dc904e44a72d19b5b6d2d46f9f61bf1ca332b686fa6f561c183cb3abcbe4c1aaf"

RPROVIDES:${PN} += "libqhull_r.so.8.0()(64bit) \
libqhull_r8_0 \
libqhull_r8_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
