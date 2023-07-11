SUMMARY = "Documentation files for charliecloud"
DESCRIPTION = "Charliecloud provides user-defined software stacks (UDSS) \
for high-performance computing (HPC) centers. \
This package provides documentation files for Charliecloud."
LICENSE = "Apache-2.0"

PV = "0.23"

RPM_NAME = "charliecloud-doc-0.23-1.9.noarch.rpm"
RPM_HASH = "9174046eb7c5a42445171c34bb5ad49535e1582294c3ed283cffe2570db4c0e0c48b67403d1f98ef51b4c19b24eb533ee05ea8e482de1a730265f2968b030134"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "charliecloud-doc"

RDEPENDS:${PN} += ""

inherit rpm
