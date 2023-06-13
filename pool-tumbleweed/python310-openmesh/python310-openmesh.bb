SUMMARY = "A data structure for representing and manipulating polygon meshes"
DESCRIPTION = "A halfedge-based data structure for representing and manipulating polygon meshes."
LICENSE = "BSD-3-Clause"

PV = "1.2.1"

RPM_NAME = "python310-openmesh-1.2.1-1.4.aarch64.rpm"
RPM_HASH = "d03b8809a8989b62afe26bf3ec1bfd5eb98533f857c51920502c7319273c09ee00e8de15965a5d0e701cc4821a051648e15c1ff248549dfb35d17b698aba1f53"

RPROVIDES:${PN} += "python3-openmesh \
python3.10dist(openmesh) \
python310-openmesh \
python310-openmesh(aarch-64) \
python3dist(openmesh)"

RDEPENDS:${PN} += "libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
python(abi) \
python310-numpy"

inherit rpm
