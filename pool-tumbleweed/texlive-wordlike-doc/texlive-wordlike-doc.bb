SUMMARY = "Documentation for texlive-wordlike"
DESCRIPTION = "This package includes the documentation for texlive-wordlike"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2bsvn15878"

RPM_NAME = "texlive-wordlike-doc-2023.201.1.2bsvn15878-53.1.noarch.rpm"
RPM_HASH = "24297f4c971868872587c9bee5846bdab4d28b44ef3fd610d0783ee292c15cbb16d3176e0a852b7fa5c4300e6a94004eb55b759f51c6041f9d6e2aca70a2da20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-wordlike-doc"

RDEPENDS:${PN} += ""

inherit rpm
