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

PV = "2023.209.1.0svn29613"

RPM_NAME = "texlive-iitem-2023.209.1.0svn29613-54.1.noarch.rpm"
RPM_HASH = "9cca18ec0bd1494c9edd0ae3f55353b26fe021d22a8ac09468b0b4821c02dcb9317f248b4634fa2ae4e82d8a7c9183033a381182743123f88ba0d50cfda7d048"
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
