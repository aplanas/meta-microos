SUMMARY = "Documentation for texlive-xcolor-material"
DESCRIPTION = "This package includes the documentation for texlive-xcolor-material"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn42289"

RPM_NAME = "texlive-xcolor-material-doc-2023.209.0.0.1svn42289-53.1.noarch.rpm"
RPM_HASH = "a7c61800b07ef49c9b3bb903464109b4475f1cf2899dfc184dd0f5dd7207d0a34ec1d918ebe4f682c4f83686af04cdaf878dfd62cc4cd7710b14447880aacb54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xcolor-material-doc"

RDEPENDS:${PN} += ""

inherit rpm
