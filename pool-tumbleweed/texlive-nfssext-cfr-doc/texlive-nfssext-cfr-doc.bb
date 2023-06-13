SUMMARY = "Documentation for texlive-nfssext-cfr"
DESCRIPTION = "This package includes the documentation for texlive-nfssext-cfr"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn43640"

RPM_NAME = "texlive-nfssext-cfr-doc-2023.201.svn43640-54.1.noarch.rpm"
RPM_HASH = "ffd47a22192fa6691c12521600a1ece52b6f15144e7fa5b244f549ee99f68f7027b62199a38107b6428b07048c2a1ed1b492998fbcc7f39519ff9eda6d5b797e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-nfssext-cfr-doc"

RDEPENDS:${PN} += ""

inherit rpm
