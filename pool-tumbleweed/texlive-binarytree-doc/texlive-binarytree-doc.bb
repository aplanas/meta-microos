SUMMARY = "Documentation for texlive-binarytree"
DESCRIPTION = "This package includes the documentation for texlive-binarytree"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.01svn41777"

RPM_NAME = "texlive-binarytree-doc-2023.209.1.01svn41777-54.1.noarch.rpm"
RPM_HASH = "fa229b6897f5ec81fdf63c604e213d4d8f22cee184c59e643ded748f04d59e7977cbdb98a650c163f1f98bc929f2d8f8f4c7f132355140e44fc6f5851eeb5a60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-binarytree-doc"

RDEPENDS:${PN} += ""

inherit rpm
