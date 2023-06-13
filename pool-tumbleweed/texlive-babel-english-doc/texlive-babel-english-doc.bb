SUMMARY = "Documentation for texlive-babel-english"
DESCRIPTION = "This package includes the documentation for texlive-babel-english"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.3rsvn44495"

RPM_NAME = "texlive-babel-english-doc-2023.201.3.3rsvn44495-53.1.noarch.rpm"
RPM_HASH = "8559fb5438008dce9baac4fbf0a3f9ff03fbc1087dd18222edbd5d91aab16a961e985ac9c2a38e12c05bbb2960c0dce6bdf581ff72ef043241a91c6f30da457e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-english-doc"

RDEPENDS:${PN} += ""

inherit rpm
