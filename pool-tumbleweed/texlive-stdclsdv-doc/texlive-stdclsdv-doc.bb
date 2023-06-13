SUMMARY = "Documentation for texlive-stdclsdv"
DESCRIPTION = "This package includes the documentation for texlive-stdclsdv"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1asvn15878"

RPM_NAME = "texlive-stdclsdv-doc-2023.201.1.1asvn15878-57.1.noarch.rpm"
RPM_HASH = "b23fad2119937b7b5b730302f80d3ff1cf7daafc60ee3f7d71dd7fba632e8bb3272f1dd6f24a5c57aa3fcf2c2a9bc30708bf92a7cf435884c526a01c8c97aa49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-stdclsdv-doc"

RDEPENDS:${PN} += ""

inherit rpm
