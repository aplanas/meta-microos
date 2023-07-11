SUMMARY = "Documentation for texlive-guitlogo"
DESCRIPTION = "This package includes the documentation for texlive-guitlogo"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.0_alpha.4svn55741"

RPM_NAME = "texlive-guitlogo-doc-2023.201.1.0.0_alpha.4svn55741-53.2.noarch.rpm"
RPM_HASH = "2634862ecdf781d71f6b89b73374e51c508647ce5fa28a47e8ebe8d7b051885c66521213ac950c1d94c89ab4ff880273d071e1d067cc999eb4de5bbb13fdf03c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-guitlogo-doc-it \
texlive-guitlogo-doc"

RDEPENDS:${PN} += ""

inherit rpm
