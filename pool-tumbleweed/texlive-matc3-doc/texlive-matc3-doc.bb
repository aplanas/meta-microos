SUMMARY = "Documentation for texlive-matc3"
DESCRIPTION = "This package includes the documentation for texlive-matc3"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.1svn29845"

RPM_NAME = "texlive-matc3-doc-2023.201.1.0.1svn29845-52.1.noarch.rpm"
RPM_HASH = "d7d3948ade90f7ad4c9f87c8fb9f933250a71ae0706cf0fc487b591a2f4151b03d8b640adf725a79a81b7ea75197d23108c9bd6f08b2ada85801abd3e75c4969"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-matc3-doc:it) \
texlive-matc3-doc"

RDEPENDS:${PN} += ""

inherit rpm
