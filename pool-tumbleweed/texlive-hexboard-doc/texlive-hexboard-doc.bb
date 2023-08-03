SUMMARY = "Documentation for texlive-hexboard"
DESCRIPTION = "This package includes the documentation for texlive-hexboard"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn62102"

RPM_NAME = "texlive-hexboard-doc-2023.209.1.0svn62102-54.1.noarch.rpm"
RPM_HASH = "5c9836717848785138202251d2f15dc43336ab2d83380a8ded4fdbde227d5368db3d34e6329bf30823a7a1f5b060e5d3481196c928a55f2bf654305a383b6a1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hexboard-doc"

RDEPENDS:${PN} += ""

inherit rpm
