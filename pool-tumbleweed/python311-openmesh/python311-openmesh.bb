SUMMARY = "A data structure for representing and manipulating polygon meshes"
DESCRIPTION = "A halfedge-based data structure for representing and manipulating polygon meshes."
LICENSE = "BSD-3-Clause"

PV = "1.2.1"

RPM_NAME = "python311-openmesh-1.2.1-1.4.aarch64.rpm"
RPM_HASH = "3be710eef027095cace12aa24782d44272a3ed4ffa907f6dbad565977db33798748e85d8272885bfc7ca16a089b39026d6230dc44ae674395d5e8ebfe865e183"

RPROVIDES:${PN} += "python3.11dist(openmesh) \
python311-openmesh \
python311-openmesh(aarch-64) \
python3dist(openmesh)"

RDEPENDS:${PN} += "libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
python(abi) \
python311-numpy"

inherit rpm
