SUMMARY = "Documentation for texlive-ppt-slides"
DESCRIPTION = "This package includes the documentation for texlive-ppt-slides"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2.1svn65194"

RPM_NAME = "texlive-ppt-slides-doc-2023.201.0.0.2.1svn65194-52.1.noarch.rpm"
RPM_HASH = "0a0f2612fd4182531b73c58a693c91a4aef052561c868f6140ecb1e26c09cd8f6764d3f6bd136366bc91199ebc1fcc55c0b21e722945ba7ebe34b0b7e31979fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ppt-slides-doc"

RDEPENDS:${PN} += ""

inherit rpm
