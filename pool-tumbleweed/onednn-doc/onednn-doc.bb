SUMMARY = "Reference documentation for the Intel Math Kernel Library"
DESCRIPTION = "The reference documentation for the Intel Math Kernel Library can be installed \
with this package."
LICENSE = "Apache-2.0"

PV = "3.0.1"

RPM_NAME = "onednn-doc-3.0.1-1.2.noarch.rpm"
RPM_HASH = "122b0b458a2360f7c32edd5680eece4f81b3513d9ea023ddef49f35dff7e2bd8c6d6a90891414e4f4a18039ceca6e4d1bf648b82a53e708f797ab4a8864d5199"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "onednn-doc"

RDEPENDS:${PN} += ""

inherit rpm
