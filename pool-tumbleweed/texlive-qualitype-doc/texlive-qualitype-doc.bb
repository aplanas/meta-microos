SUMMARY = "Documentation for texlive-qualitype"
DESCRIPTION = "This package includes the documentation for texlive-qualitype"
LICENSE = "OFL-1.1"

PV = "2023.201.svn54512"

RPM_NAME = "texlive-qualitype-doc-2023.201.svn54512-53.2.noarch.rpm"
RPM_HASH = "4d8fa4e4ee5f8152b52470195f2657dfc36776be728012c988587c5832884fcdf3132bbb5c45b5b9febb18cd1a29f30f14ea8799609fe51498dd0993aacae6e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-qualitype-doc"

RDEPENDS:${PN} += ""

inherit rpm
