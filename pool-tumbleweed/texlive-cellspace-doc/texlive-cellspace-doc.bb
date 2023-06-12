SUMMARY = "Documentation for texlive-cellspace"
DESCRIPTION = "This package includes the documentation for texlive-cellspace"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.9.0svn61501"

RPM_NAME = "texlive-cellspace-doc-2023.201.1.9.0svn61501-52.1.noarch.rpm"
RPM_HASH = "04ef295f16c7ad5ec660bae60e90d77e5946d7a0964d3a914e28e1f75278b16ceed38576d39be9c783513142a9b5d0f60d7f0e68389bd9ed8523cdff5798c55c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cellspace-doc"
RDEPENDS:${PN} += ""

inherit rpm
