SUMMARY = "Documentation for texlive-bidipresentation"
DESCRIPTION = "This package includes the documentation for texlive-bidipresentation"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn35267"

RPM_NAME = "texlive-bidipresentation-doc-2023.201.0.0.3svn35267-53.1.noarch.rpm"
RPM_HASH = "cccacc8bde0c39ac9e57ff307f98ffb3224e50443997b0cb6181a2a1e52605a61285db60c5c906dc9588091681d708f531e5c2daa19149270289bb2d73a4f2c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bidipresentation-doc"

RDEPENDS:${PN} += ""

inherit rpm
