SUMMARY = "A Python library for manipulating indices of ndarrays"
DESCRIPTION = "A Python library for manipulating indices of ndarrays."
LICENSE = "MIT"

PV = "1.6"

RPM_NAME = "python39-ndindex-1.6-1.1.aarch64.rpm"
RPM_HASH = "5c0516338067a87880d383c6ef8bc9aaf55c2d3a7b40384f7221d3fcedb1963596b0c66a4c79199022c2888f5a45aa1355dbbbaa1112a0aa19a3fb5511ea3ff0"

RPROVIDES:${PN} += "python3.9dist(ndindex) \
python39-ndindex \
python39-ndindex(aarch-64) \
python3dist(ndindex)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
python(abi)"

inherit rpm
