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

RPROVIDES:${PN} += "normaliz \
normaliz(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libeanticxx.so.1()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgmp.so.10()(64bit) \
libnormaliz.so.3()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
