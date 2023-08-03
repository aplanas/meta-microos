SUMMARY = "Documentation for texlive-biblatex-shortfields"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-shortfields"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.1svn45858"

RPM_NAME = "texlive-biblatex-shortfields-doc-2023.209.1.0.1svn45858-54.1.noarch.rpm"
RPM_HASH = "7874242641fff85dcb173fc53ddb9ebb204fcb711070d5b4d8a4e59ddc8a668cef1f0ae2cbb0d95f2e61b5bc8ca24fa0c75496ee9e876488cb9e2a9719624075"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-shortfields-doc"

RDEPENDS:${PN} += ""

inherit rpm
