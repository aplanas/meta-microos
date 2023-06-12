SUMMARY = "Documentation for texlive-xymtex"
DESCRIPTION = "This package includes the documentation for texlive-xymtex"
LICENSE = "LPPL-1.0"

PV = "2023.201.5.06svn32182"

RPM_NAME = "texlive-xymtex-doc-2023.201.5.06svn32182-52.1.noarch.rpm"
RPM_HASH = "0753aae2d8ec20c0dae3fecbeaca7575162dc4a51599e6bb08ab3955b5fea4064ccb93a87e20892826ddcba84f62e34558d7d4700daacc3c977a056cbb355ea4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-xymtex-doc:ja) \
texlive-xymtex-doc"
RDEPENDS:${PN} += ""

inherit rpm
