SUMMARY = "Tools for computations in affine monoids and rational cones"
DESCRIPTION = "Normaliz is a tool for computations in affine monoids, vector configurations, \
lattice polytopes, and rational cones. It supports, \
 \
* convex hulls and dual cones \
* conversion from generators to constraints and vice versa \
* triangulations, disjoint decompositions and Stanley decompositions \
* Hilbert basis of rational, not necessarily pointed cones \
* normalization of affine monoids \
* lattice points of rational polytopes and (unbounded) polyhedra \
* Hilbert (or Ehrhart) series and (quasi) polynomials under \
  Z-gradings (for example, for rational polytopes) \
* generalized (or weighted) Ehrhart series and Lebesgue integrals of \
  polynomials over rational polytopes via NmzIntegrate"
LICENSE = "GPL-3.0-or-later"

PV = "3.9.4"

RPM_NAME = "normaliz-3.9.4-1.4.aarch64.rpm"
RPM_HASH = "5203fce9e30da1f1972a0dc47bebb4732fe31a3861a1a9bb3f0999d0abab6e1daecd48089e40f5a8ba95a6f43b76c899e68676799ab415cf8a1e9097f1c73a00"

RPROVIDES:${PN} += "normaliz"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libeanticxx.so.1 \
libgcc-s.so.1 \
libgmp.so.10 \
libnormaliz.so.3 \
libstdc++.so.6"

inherit rpm
