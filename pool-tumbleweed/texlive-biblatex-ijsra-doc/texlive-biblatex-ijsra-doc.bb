SUMMARY = "Documentation for texlive-biblatex-ijsra"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-ijsra"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn41634"

RPM_NAME = "texlive-biblatex-ijsra-doc-2023.201.0.0.1svn41634-53.1.noarch.rpm"
RPM_HASH = "91b0a227b5244744f97c2c2309b62250aa44cdaf83500ea2864b10a4b231b6d1f088797c41427ed7b16d64b406e44373cace4f01c443c6aa60dadb9ae6b9b114"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-ijsra-doc"
RDEPENDS:${PN} += ""

inherit rpm
