SUMMARY = "Development Files for Vc"
DESCRIPTION = "Vc is a free software library to ease explicit vectorization of C++ code. It \
has an intuitive API and provides portability between different compilers and \
compiler versions as well as portability between different vector instruction \
sets. \
 \
This package provides development headers needed to build software using Vc."
LICENSE = "BSD-3-Clause"

PV = "1.4.3"

RPM_NAME = "Vc-devel-1.4.3-1.7.aarch64.rpm"
RPM_HASH = "546b83a7f4ac41f289a1fefdc99d2a60fd53ab5d182b985f8814258bd8a4146b3847a97fe6ef795547afa418f3d679479c373dd0ba6332071b0fde59028f35b5"

RPROVIDES:${PN} += "Vc-devel \
cmake-Vc"

RDEPENDS:${PN} += "Vc-devel-static"

inherit rpm
