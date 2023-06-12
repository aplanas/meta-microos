SUMMARY = "Documentation for texlive-pst-contourplot"
DESCRIPTION = "This package includes the documentation for texlive-pst-contourplot"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.6svn48230"

RPM_NAME = "texlive-pst-contourplot-doc-2023.201.0.0.6svn48230-52.1.noarch.rpm"
RPM_HASH = "ed7d7d14ba2c511345239da352fa29952a247b4fa7726c88255c8a79766203727bee8f386dd4a6b7eaf4a80409a30c846d33cfed358727e47823e0baee7f2c14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-pst-contourplot-doc:fr) \
texlive-pst-contourplot-doc"
RDEPENDS:${PN} += ""

inherit rpm
