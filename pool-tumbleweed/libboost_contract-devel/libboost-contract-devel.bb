SUMMARY = "Development headers for Boost.Contract"
DESCRIPTION = "Development headers and libraries for Boost.Contract, a library \
that implements Design by Contract or DbC or contract programming. \
 \
This package installs the default Boost version of the library."
LICENSE = "MIT"

PV = "1.82.0"

RPM_NAME = "libboost_contract-devel-1.82.0-1.1.noarch.rpm"
RPM_HASH = "9cefcec8bdb4da857f7152994e41a55eb2dfe5cc8c13197b8066ce7159036e13a5495034aebbd6deb5936a072491dcd4d9c94439d5c5029f9ca4afc62719645a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libboost_contract-devel"

RDEPENDS:${PN} += "libboost_contract1_82_0-devel"

inherit rpm
