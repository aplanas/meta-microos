SUMMARY = "Documentation for texlive-pstricks-add"
DESCRIPTION = "This package includes the documentation for texlive-pstricks-add"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.93svn65067"

RPM_NAME = "texlive-pstricks-add-doc-2023.209.3.93svn65067-54.1.noarch.rpm"
RPM_HASH = "eb30e9288c7f0be9aa3d70fd6e831912e7102617194aafccfca0609650289faa0649a20b635dfa51b107d3d6dd540e51e05b0d929545171499b0508cfe1b7935"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pstricks-add-doc"

RDEPENDS:${PN} += ""

inherit rpm
