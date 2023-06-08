SUMMARY = "Another Zero One Vertex Enumeration tool"
DESCRIPTION = "azove is a tool designed for counting (without explicit enumeration) \
and enumeration of 0/1 vertices. \
 \
Given a polytope by a linear relaxation or facet description P = {x | \
Ax <= b}, all 0/1 points lying in P can be counted or enumerated. \
This is done by intersecting the polytope P with the unit-hypercube \
[0,1]^d. The integral vertices (no fractional ones) of this \
intersection will be enumerated. If P is a 0/1 polytope, azove solves \
the vertex enumeration problem. In fact, it can also solve the 0/1 \
knapsack problem and the 0/1 subset sum problem."
LICENSE = "GPL-2.0-or-later"

PV = "2.0"

RPM_NAME = "azove-2.0-2.13.aarch64.rpm"
RPM_HASH = "6d6f14eaa5f7ed4f1f53539c528e3e61fb3f68f3304e6066e506222c926b2cb70f5164bed19cf40b144de73c4ab362fc94d99da17d89fc42549fab28f19b6b17"

RPROVIDES:${PN} += "azove azove(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgmp.so.10()(64bit) libgmpxx.so.4()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
