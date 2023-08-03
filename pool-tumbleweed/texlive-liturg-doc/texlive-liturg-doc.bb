SUMMARY = "Documentation for texlive-liturg"
DESCRIPTION = "This package includes the documentation for texlive-liturg"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn15878"

RPM_NAME = "texlive-liturg-doc-2023.209.1.0svn15878-55.1.noarch.rpm"
RPM_HASH = "4a82cd3b82420eba06f58888d3e1f1fb8c11929abc5d0793834d2eac344e4d43ba0c13bac0e447da50ff9de074094f0205018aee1449a0a78e97cd5c865751d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-liturg-doc"

RDEPENDS:${PN} += ""

inherit rpm
