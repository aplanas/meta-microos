SUMMARY = "Documentation for texlive-qyxf-book"
DESCRIPTION = "This package includes the documentation for texlive-qyxf-book"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.1.0svn56319"

RPM_NAME = "texlive-qyxf-book-doc-2023.209.3.1.0svn56319-54.1.noarch.rpm"
RPM_HASH = "6fef93386175bd793d9e8e85d943ddfde84223b45141245d5d80ff19364ee4623ccb80044ee534963cb4fbc35371d23f3b991c0b863ef16d2aedf9507b6df939"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-qyxf-book-doc-zh \
texlive-qyxf-book-doc"

RDEPENDS:${PN} += ""

inherit rpm
