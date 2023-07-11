SUMMARY = "A data structure for representing and manipulating polygon meshes"
DESCRIPTION = "A halfedge-based data structure for representing and manipulating polygon meshes."
LICENSE = "BSD-3-Clause"

PV = "1.2.1"

RPM_NAME = "python310-openmesh-1.2.1-1.5.aarch64.rpm"
RPM_HASH = "f9cbdc8bd9ad0ce6d5048aeca98fb70901fd88ed6df90ad18521fddc114f8614770e8799d7ac16086d126bac751ace1d84d79a389b9063894268221b2b34342e"

RPROVIDES:${PN} += "python3.10dist-openmesh \
python310-openmesh \
python3dist-openmesh"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python310-numpy"

inherit rpm
