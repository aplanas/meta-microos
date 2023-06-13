SUMMARY = "Documentation for texlive-dirtree"
DESCRIPTION = "This package includes the documentation for texlive-dirtree"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.32svn42428"

RPM_NAME = "texlive-dirtree-doc-2023.201.0.0.32svn42428-52.1.noarch.rpm"
RPM_HASH = "bc67cd23ade64ee293e7e0b2929b81338728cb98398b4ffef67afc86241658b64465127934d81e6417dbce1db676c4d2b16a81972ed473fe883bd0fa4e06ac02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dirtree-doc"

RDEPENDS:${PN} += ""

inherit rpm
