SUMMARY = "A data structure for representing and manipulating polygon meshes"
DESCRIPTION = "A halfedge-based data structure for representing and manipulating polygon meshes."
LICENSE = "BSD-3-Clause"

PV = "1.2.1"

RPM_NAME = "python39-openmesh-1.2.1-1.4.aarch64.rpm"
RPM_HASH = "a63e71daac9811a66756bad54d9052e5704e6d94d655484c9c1645e5fd49b13767f4676081af19dfdee777fd1989445643ed90138815aaeaf0373ebd182f9fc7"

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
