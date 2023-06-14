SUMMARY = "Edge Addition Planarity Suite"
DESCRIPTION = "EAPS provides implementations of the edge addition planar graph \
embedding algorithm and related algorithms, including a planar graph \
drawing method, an isolator for a minimal subgraph obstructing \
planarity in non-planar graphs, outerplanar graph embedder and \
obstruction isolator algorithms, and tester/isolator algorithms for \
subgraphs homeomorphic to K_{2,3}, K_4, and K_{3,3}."
LICENSE = "GPL-3.0-or-later"

PV = "3.0.2.0"

RPM_NAME = "edge-addition-planarity-suite-3.0.2.0-1.2.aarch64.rpm"
RPM_HASH = "097964ee9182718002a3ca6ba7c1a6f5addd6df971b867c8df946006b60dffb35e4cff8c66dbc2da6fbfa0342d2465e6ef0470f3735527e7368dcb6a1f834302"

RPROVIDES:${PN} += "edge-addition-planarity-suite"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libplanarity.so.0"

inherit rpm
