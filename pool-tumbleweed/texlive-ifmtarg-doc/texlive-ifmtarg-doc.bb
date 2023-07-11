SUMMARY = "Documentation for texlive-ifmtarg"
DESCRIPTION = "This package includes the documentation for texlive-ifmtarg"
LICENSE = "LPPL-1.0"

PV = "2023.208.1.2bsvn47544"

RPM_NAME = "texlive-ifmtarg-doc-2023.208.1.2bsvn47544-53.1.noarch.rpm"
RPM_HASH = "c829c90293398eca841b83e8fabec33cd9090ead7ae3e4227f9cff7c1d37e024d6284e26d1f82f1b0f135eb23696d0fee3dd91750a3ea37026408f419f6a072a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ifmtarg-doc"

RDEPENDS:${PN} += ""

inherit rpm
