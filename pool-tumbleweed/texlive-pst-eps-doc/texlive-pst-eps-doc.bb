SUMMARY = "Documentation for texlive-pst-eps"
DESCRIPTION = "This package includes the documentation for texlive-pst-eps"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn15878"

RPM_NAME = "texlive-pst-eps-doc-2023.209.1.0svn15878-53.1.noarch.rpm"
RPM_HASH = "ea31a854e1a1e27a3b59b64f39bd2c6cfab1764eb8f1c4f3d4c1bcc3e022d29ffb075e9ca895c15043ecad7950c0305816f822832344dc39ec3cb237286556a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-eps-doc"

RDEPENDS:${PN} += ""

inherit rpm
