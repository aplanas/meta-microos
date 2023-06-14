SUMMARY = "Development headers for Boost.Contract"
DESCRIPTION = "Development headers and libraries for Boost.Contract, a library \
that implements Design by Contract or DbC or contract programming."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_contract1_82_0-devel-1.82.0-1.2.aarch64.rpm"
RPM_HASH = "ae2ddce41b5b03e161a8ca0e97ae97651abc051b74b8837f3aff206421fdbec9fa4e271076951ed937c689bbf4229216c9f834e22d4afc76006faf01d5de0075"

RPROVIDES:${PN} += "libboost-contract-devel-impl \
libboost-contract1-82-0-devel"

RDEPENDS:${PN} += "libboost-contract1-82-0 \
libboost-headers1-82-0-devel \
libboost-system1-82-0-devel \
libstdc++-devel"

inherit rpm
