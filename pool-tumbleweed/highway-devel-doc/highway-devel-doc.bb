SUMMARY = "Documentation for Highway"
DESCRIPTION = "Highway is a C++ library that provides portable SIMD/vector intrinsics. \
 \
Documentation for Highway development."
LICENSE = "Apache-2.0"

PV = "1.0.5"

RPM_NAME = "highway-devel-doc-1.0.5-1.1.noarch.rpm"
RPM_HASH = "1a7de6dd2600b09ef0b68bbf988ca606ca2a824b7c449546c108a31a018fec0c5e3f3de6a3def1cc56aeeb2b06c42a397f5fc723967bb6ca6030873372c9a832"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "highway-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
