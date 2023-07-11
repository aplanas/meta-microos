SUMMARY = "GNU Triangulated Surface Library (GTS)"
DESCRIPTION = "GTS stands for the GNU Triangulated Surface Library. It is an Open \
Source Free Software Library intended to provide a set of useful \
functions to deal with 3D surfaces meshed with interconnected \
triangles. \
 \
A brief summary of its main features: \
 \
  * Simple object-oriented structure giving easy access to topological \
    properties. \
  * 2D dynamic Delaunay and constrained Delaunay triangulations. \
  * Robust geometric predicates (orientation, in circle) using fast \
    adaptive floating point arithmetic (adapted from the fine work of \
    Jonathan R.  Shewchuk). \
  * Robust set operations on surfaces (union, intersection, difference). \
  * Surface refinement and coarsening (multiresolution models). \
  * Dynamic view-independent continuous level-of-detail. \
  * Preliminary support for view-dependent level-of-detail. \
  * Bounding-boxes trees and Kd-trees for efficient point location and \
    collision/intersection detection. \
  * Graph operations: traversal, graph partitioning. \
  * Metric operations (area, volume, curvature ...). \
  * Triangle strips generation for fast rendering."
LICENSE = "LGPL-2.0+"

PV = "0.7.6_p20121130"

RPM_NAME = "gts-0.7.6_p20121130-4.30.aarch64.rpm"
RPM_HASH = "6caa0d086bfe2e23bd555bc34a4b91f7e597b8f052d3809472236609f008ca0e38e7a7ade950d4822ce768f7a140f8694b2fcc91eb71f37380c591cb288d6edd"

RPROVIDES:${PN} += "gts"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgts-0-7-5 \
libgts-0.7.so.5 \
libm.so.6"

inherit rpm
