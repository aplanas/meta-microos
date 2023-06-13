SUMMARY = "Documentation for texlive-emisa"
DESCRIPTION = "This package includes the documentation for texlive-emisa"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.3.0svn60068"

RPM_NAME = "texlive-emisa-doc-2023.201.2.3.0svn60068-53.1.noarch.rpm"
RPM_HASH = "f9812f0e7f37faadef59e4c27ef6de81e8b625622129fcb3a25f20c9902a4a672dcb2a0353a374989fe003fa9131d34e742e898a24455042c6fb0b0e37cb8419"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-emisa-doc"

RDEPENDS:${PN} += ""

inherit rpm
