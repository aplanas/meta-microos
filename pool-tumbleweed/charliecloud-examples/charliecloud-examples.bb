SUMMARY = "Example files for charliecloud"
DESCRIPTION = "Charliecloud provides user-defined software stacks (UDSS) \
for high-performance computing (HPC) centers. \
This package provides example files for Charliecloud."
LICENSE = "Apache-2.0"

PV = "0.23"

RPM_NAME = "charliecloud-examples-0.23-1.8.noarch.rpm"
RPM_HASH = "775d3d569c7dffd0ce9e78e7b15d81d37d17f494d0fdde5911a92b7a9c72e5de5ace54bb08f49001e5257f9dbfcbba12cb6de7920e45e436e9cfb94c5117db9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "charliecloud-examples"
RDEPENDS:${PN} += ""

inherit rpm
