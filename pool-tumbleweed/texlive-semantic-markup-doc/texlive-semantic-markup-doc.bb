SUMMARY = "Documentation for texlive-semantic-markup"
DESCRIPTION = "This package includes the documentation for texlive-semantic-markup"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn53607"

RPM_NAME = "texlive-semantic-markup-doc-2023.201.svn53607-53.1.noarch.rpm"
RPM_HASH = "a22756263e8e4a6bcf8eaeae4f006f66631eb48bd91741e17f7b628bab51fdc4b299acf4aa4b67cc8439b21c41535d4adf36ffe85149eab420b47e5d5f685aa6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-semantic-markup-doc"
RDEPENDS:${PN} += ""

inherit rpm
