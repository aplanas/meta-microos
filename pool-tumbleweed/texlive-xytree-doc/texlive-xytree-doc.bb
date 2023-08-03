SUMMARY = "Documentation for texlive-xytree"
DESCRIPTION = "This package includes the documentation for texlive-xytree"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5svn15878"

RPM_NAME = "texlive-xytree-doc-2023.209.1.5svn15878-53.1.noarch.rpm"
RPM_HASH = "c2bd0e1ff430bb6e4e1f81740e8c82d49c3d8735a0e4045bbb64663cf6bc64bb0ccf6eb351ef8057fc234710f2aa0aff9113914944df76d410502906ec373364"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-xytree-doc-en \
texlive-xytree-doc"

RDEPENDS:${PN} += ""

inherit rpm
