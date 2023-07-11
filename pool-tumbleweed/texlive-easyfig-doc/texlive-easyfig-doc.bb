SUMMARY = "Documentation for texlive-easyfig"
DESCRIPTION = "This package includes the documentation for texlive-easyfig"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2asvn64967"

RPM_NAME = "texlive-easyfig-doc-2023.201.1.2asvn64967-53.2.noarch.rpm"
RPM_HASH = "6371504d88ce2599bc7762c35f707287d4d8d3004b210bde2d143d2b31afb9970b13f991601d002d44d2d566de6ed3f55936578fc0bea259ffc70c58f807a804"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-easyfig-doc"

RDEPENDS:${PN} += ""

inherit rpm
