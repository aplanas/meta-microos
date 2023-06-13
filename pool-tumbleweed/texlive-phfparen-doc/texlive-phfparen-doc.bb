SUMMARY = "Documentation for texlive-phfparen"
DESCRIPTION = "This package includes the documentation for texlive-phfparen"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn41859"

RPM_NAME = "texlive-phfparen-doc-2023.201.1.0svn41859-51.1.noarch.rpm"
RPM_HASH = "809a7eb261058e477d7bcb97b1346b3f6899056e01b44e612d196bd0f4bd077cff595b4890ce0fe0ce871ad12792e05eebc451728e83edea5832c0ed96c2c0cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-phfparen-doc"

RDEPENDS:${PN} += ""

inherit rpm
