SUMMARY = "Example files for charliecloud"
DESCRIPTION = "Charliecloud provides user-defined software stacks (UDSS) \
for high-performance computing (HPC) centers. \
This package provides example files for Charliecloud."
LICENSE = "Apache-2.0"

PV = "0.23"

RPM_NAME = "charliecloud-examples-0.23-1.9.noarch.rpm"
RPM_HASH = "c45647518d52093adef207b88cc2f574a8cf6aa775a521986c94ae29b67acca71776ff02e260cedbd1c423ef4405b22892016b2ff53c99ab0d18f66cd6bb391f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "charliecloud-examples"

RDEPENDS:${PN} += ""

inherit rpm
