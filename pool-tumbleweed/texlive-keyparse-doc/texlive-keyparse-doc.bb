SUMMARY = "Documentation for texlive-keyparse"
DESCRIPTION = "This package includes the documentation for texlive-keyparse"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn60277"

RPM_NAME = "texlive-keyparse-doc-2023.201.1.1svn60277-55.1.noarch.rpm"
RPM_HASH = "4dc00fa97a0ba146bb5bfe2af276124ed9596eb2b60477607b470175995d29aa303c375dc2a360270d180180c26a586d87ef0f9f1acefb0197b1d7b984f046d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-keyparse-doc"

RDEPENDS:${PN} += ""

inherit rpm
