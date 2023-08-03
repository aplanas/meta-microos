SUMMARY = "Documentation for texlive-tikz-cd"
DESCRIPTION = "This package includes the documentation for texlive-tikz-cd"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn59133"

RPM_NAME = "texlive-tikz-cd-doc-2023.209.1.0svn59133-55.1.noarch.rpm"
RPM_HASH = "1e93ae54936b98dfc088c4d90d4bf3d66146ff9b37b65ca49aabf1ab4bc3c8f2e440e201b6c8b7a9317dfb7f67d0084ebcdc4b607cfbb607b0b1963c6cb33559"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikz-cd-doc"

RDEPENDS:${PN} += ""

inherit rpm
