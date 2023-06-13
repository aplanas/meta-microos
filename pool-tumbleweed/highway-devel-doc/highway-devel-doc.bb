SUMMARY = "Documentation for Highway"
DESCRIPTION = "Highway is a C++ library that provides portable SIMD/vector intrinsics. \
 \
Documentation for Highway development."
LICENSE = "Apache-2.0"

PV = "1.0.4"

RPM_NAME = "highway-devel-doc-1.0.4-4.1.noarch.rpm"
RPM_HASH = "a6f7190a945db41c15264d1b6e18eccacbf19160dc47552d31d2c36dc5f0fe08ce86638cc9609cf31b08c1b5e741f02393d36d3a46eb98507592e5f9cfb07328"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "highway-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
