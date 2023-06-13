SUMMARY = "Documentation for texlive-nevelok"
DESCRIPTION = "This package includes the documentation for texlive-nevelok"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.03svn39029"

RPM_NAME = "texlive-nevelok-doc-2023.201.1.03svn39029-54.1.noarch.rpm"
RPM_HASH = "a0775e45876d51ece6d0457a19fd2b48490a9b4697af8332b222874604c5624e72d48815dab2aab34953f8e1c55587f65a0b0d223f099f60a82d1d1041ec3057"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-nevelok-doc"

RDEPENDS:${PN} += ""

inherit rpm
