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

RPM_NAME = "normaliz-3.9.4-1.5.aarch64.rpm"
RPM_HASH = "8e23d5a4e33409cc6798c6d3d233aae65e6ccf0b420d716c9a20440f7b39d12f6b55d0136647c58f0c485a339fadcf585cc2dec3d267bcb2f70a6df2c46b62da"

RPROVIDES:${PN} += "normaliz"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libeanticxx.so.1 \
libgcc-s.so.1 \
libgmp.so.10 \
libnormaliz.so.3 \
libstdc++.so.6"

inherit rpm
