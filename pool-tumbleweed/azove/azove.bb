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

RPROVIDES:${PN} += "azove"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgmp.so.10 \
libgmpxx.so.4 \
libstdc++.so.6"

inherit rpm
