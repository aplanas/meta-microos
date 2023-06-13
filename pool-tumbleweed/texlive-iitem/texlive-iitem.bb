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

PV = "2023.201.1.0svn29613"

RPM_NAME = "texlive-iitem-2023.201.1.0svn29613-52.1.noarch.rpm"
RPM_HASH = "2ce826ccbf486c3a1b51a7bd4ed49e5d62849f88056db9bf4c8cce6f13e6b141a1b441af22addcc6d9c7b57564570c16e41005c3c84d40eca2bb3441686a5bdb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(iitem.sty) \
texlive-iitem"

RDEPENDS:${PN} += "/bin/sh \
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
