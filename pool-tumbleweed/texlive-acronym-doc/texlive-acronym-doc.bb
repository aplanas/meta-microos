SUMMARY = "Documentation for texlive-acronym"
DESCRIPTION = "This package includes the documentation for texlive-acronym"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.47svn54758"

RPM_NAME = "texlive-acronym-doc-2023.201.1.47svn54758-54.1.noarch.rpm"
RPM_HASH = "d8c6936583bdfe1ffed6f29c9a5ec6cf2509f721aa7f84d422aab64d756208f6834661057c1dde2352d5638b34389fe50e93e2e3c29d20f6a91bcbd0e7787401"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-acronym-doc"

RDEPENDS:${PN} += ""

inherit rpm
