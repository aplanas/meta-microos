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

RPM_NAME = "python311-fastcluster-1.2.6-1.5.aarch64.rpm"
RPM_HASH = "7d3b6c2050ae661a534ace169427020cdf6bc4deb908bebec85a229bf688c504000ea056595ac2242349a7991f7787f779adc972aeafe9dbf9aeb84dfd61e083"

RPROVIDES:${PN} += "python3.11dist-fastcluster \
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
