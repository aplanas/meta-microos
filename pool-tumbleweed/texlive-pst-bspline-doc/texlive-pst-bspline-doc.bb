SUMMARY = "Documentation for texlive-pst-bspline"
DESCRIPTION = "This package includes the documentation for texlive-pst-bspline"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.62svn40685"

RPM_NAME = "texlive-pst-bspline-doc-2023.209.1.62svn40685-53.1.noarch.rpm"
RPM_HASH = "1fdd7f0002a4fd6982e1678a73cd825b6533c60931047e789dfd857c628b6b2f6e25fa617928bf5101daec1a9767ef13275a339833800260292d24f4cc025a91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-bspline-doc"

RDEPENDS:${PN} += ""

inherit rpm
