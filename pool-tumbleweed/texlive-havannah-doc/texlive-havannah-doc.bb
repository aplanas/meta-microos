SUMMARY = "Documentation for texlive-havannah"
DESCRIPTION = "This package includes the documentation for texlive-havannah"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn36348"

RPM_NAME = "texlive-havannah-doc-2023.209.svn36348-54.1.noarch.rpm"
RPM_HASH = "54efeca8daaf4b229f1974a3103c8276616e606e1a09e6de28f9a446f7ecb8012c5e70dff74b76009ed23139403227946ac37d528c67f1ea31ae3d6db65139cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-havannah-doc"

RDEPENDS:${PN} += ""

inherit rpm
