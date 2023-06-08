SUMMARY = "Documentation files for charliecloud"
DESCRIPTION = "Charliecloud provides user-defined software stacks (UDSS) \
for high-performance computing (HPC) centers. \
This package provides documentation files for Charliecloud."
LICENSE = "Apache-2.0"

PV = "0.23"

RPM_NAME = "charliecloud-doc-0.23-1.8.noarch.rpm"
RPM_HASH = "e09537cf305b9fbb47008c17bc68dc182e6fc4276dca24eac4d384b6c55878708c673f71b72aad5bf1851aa5b2c56ccdec913e39cf6d92a20090f76ed1f49acd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "charliecloud-doc"
RDEPENDS:${PN} += ""

inherit rpm
