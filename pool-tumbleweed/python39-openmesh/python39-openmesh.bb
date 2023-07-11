SUMMARY = "A data structure for representing and manipulating polygon meshes"
DESCRIPTION = "A halfedge-based data structure for representing and manipulating polygon meshes."
LICENSE = "BSD-3-Clause"

PV = "1.2.1"

RPM_NAME = "python39-openmesh-1.2.1-1.5.aarch64.rpm"
RPM_HASH = "815031bc1a12a9d7cf8d0b56f7bde162695be9f31b4801ac6e1b5eb3759a8e1077e95ce7ffb97afc8eddefc1aab2211fd083c0bc757daf7c71d28f63fbaa4179"

RPROVIDES:${PN} += "python3.9dist-openmesh \
python39-openmesh \
python3dist-openmesh"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python39-numpy"

inherit rpm
