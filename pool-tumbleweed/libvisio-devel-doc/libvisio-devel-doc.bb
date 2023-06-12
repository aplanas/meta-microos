SUMMARY = "Documentation for the libvisio API"
DESCRIPTION = "This package contains documentation for the libvisio API."
LICENSE = "MPL-2.0"

PV = "0.1.7"

RPM_NAME = "libvisio-devel-doc-0.1.7-1.27.noarch.rpm"
RPM_HASH = "9d81cf48c67646256125eb527e74a44e09bb5ecb2e7d112f25933e756e69e8307af2c3c8ae14a7ca46f77ff2ffa046d9d6a6742937700b3a20328e1d966b17a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libvisio-devel-doc"
RDEPENDS:${PN} += ""

inherit rpm
