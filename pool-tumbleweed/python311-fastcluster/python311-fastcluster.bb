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

RPM_NAME = "python311-fastcluster-1.2.6-1.7.aarch64.rpm"
RPM_HASH = "04841b0693eade5703bbe49e0219093c870a3c1b4428ac0e258b5cbd126395b81dad4328a1113acc54e5c6c0c8ad4fcf1af9ba9389e1e8376b7e957d1d5a53a9"

RPROVIDES:${PN} += "python3-fastcluster \
python3.11dist-fastcluster \
python311-fastcluster \
python3dist-fastcluster"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python311-numpy \
python311-scipy"

inherit rpm
