SUMMARY = "Hierarchical clustering routines for Python"
DESCRIPTION = "This library provides Python functions for hierarchical clustering. \
It generates hierarchical clusters from distance matrices or from \
vector data. \
 \
Part of this module is intended to replace the functions \
linkage, single, complete, average, weighted, centroid, median, ward \
in the module scipy.cluster.hierarchy with the same functionality but \
much faster algorithms. Moreover, the function 'linkage_vector' \
provides memory-efficient clustering for vector data. \
 \
The interface is very similar to MATLAB's Statistics Toolbox API to \
make code easier to port from MATLAB to Python/Numpy. The core \
implementation of this library is in C++ for efficiency."
LICENSE = "BSD-2-Clause"

PV = "1.2.6"

RPM_NAME = "python310-fastcluster-1.2.6-1.5.aarch64.rpm"
RPM_HASH = "08433ffaa5434ecf5a8fa9d9342430f41fb7ad399f86ea4c985538f85f121625ec2d1f5524d992b64175205097258e9e99dde5f7ac6c98d1cc06516c6c155d97"

RPROVIDES:${PN} += "python3-fastcluster \
python3.10dist-fastcluster \
python310-fastcluster \
python3dist-fastcluster"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python310-numpy \
python310-scipy"

inherit rpm
