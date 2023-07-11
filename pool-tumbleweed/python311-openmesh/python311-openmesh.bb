SUMMARY = "A data structure for representing and manipulating polygon meshes"
DESCRIPTION = "A halfedge-based data structure for representing and manipulating polygon meshes."
LICENSE = "BSD-3-Clause"

PV = "1.2.1"

RPM_NAME = "python311-openmesh-1.2.1-1.5.aarch64.rpm"
RPM_HASH = "94aeed85ad70152ccf2276383855be0a22bfbe87b3df0c91ddb61c1cc79655183e8446c96eb97010d81cb05b06147938f5df4db3613b2f3b78dfd976ff233394"

RPROVIDES:${PN} += "python3-openmesh \
python3.11dist-openmesh \
python311-openmesh \
python3dist-openmesh"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python311-numpy"

inherit rpm
