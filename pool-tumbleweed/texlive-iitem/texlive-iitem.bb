SUMMARY = "Multiple level of lists in one list-like environment"
DESCRIPTION = "The package defines multiple level lists within one list-like \
environment. instead of writing \\begin{enumerate} \\item 1 \
\\begin{enumerate} \\item 2 \\begin{enumerate} \\item 3 \
\\begin{enumerate} \\item 4 \\end{enumerate} \\end{enumerate} \\item \
2.1 \\end{enumerate} \\item 1.1 \\begin{enumerate} \\item 2 \
\\end{enumerate} \\end{enumerate} this package allows you to \
write \\begin{enumerate} \\item 1 \\iitem 2 \\iiitem 3 \\ivtem 4 \
\\iitem 2.1 \\item 1.1 \\iitem 2 \\end{enumerate}"
LICENSE = "LPPL-1.0"

PV = "2023.208.1.0svn29613"

RPM_NAME = "texlive-iitem-2023.208.1.0svn29613-53.1.noarch.rpm"
RPM_HASH = "e70673e63595fd15240d6037a942ddd19e42509c9407f9d8f627309bfa2e718387d0946924d0b42fb8c6b799e364df9c1b19503b941d5acf3fc62d37b63d19f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-iitem.sty \
texlive-iitem"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
