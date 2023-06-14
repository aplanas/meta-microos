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

RPM_NAME = "python39-fastcluster-1.2.6-1.5.aarch64.rpm"
RPM_HASH = "3f7a3afdf13f7d1419767a01220b0ae3cd687def7e95045167e0f188f3e0f36cd9df06b0909135bb9a413601d374d4b2454e65a11d5c353da4f7c442f8e66f2b"

RPROVIDES:${PN} += "python3.9dist-fastcluster \
python39-fastcluster \
python3dist-fastcluster"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python39-numpy \
python39-scipy"

inherit rpm
