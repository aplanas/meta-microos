SUMMARY = "Documentation for texlive-spie"
DESCRIPTION = "This package includes the documentation for texlive-spie"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.25svn15878"

RPM_NAME = "texlive-spie-doc-2023.201.3.25svn15878-57.1.noarch.rpm"
RPM_HASH = "c97086a68f5b437b19439404f79e4b633928754fb11812fd806e76630c926a51689e2f2a6b34978595a166ad162e07ed13072cef8c6c51b75388836984ff75f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-spie-doc"

RDEPENDS:${PN} += ""

inherit rpm
