SUMMARY = "Documentation for texlive-ocg-p"
DESCRIPTION = "This package includes the documentation for texlive-ocg-p"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4svn28803"

RPM_NAME = "texlive-ocg-p-doc-2023.201.0.0.4svn28803-54.1.noarch.rpm"
RPM_HASH = "0636fc1a27eef83b9fa87ab7af19a925ece15e0f7f067d9f5b61e2b56c231322c716e396b336f0acff542aea0e79584e4a790064b329b6d26961ca566d052c30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ocg-p-doc"

RDEPENDS:${PN} += ""

inherit rpm
