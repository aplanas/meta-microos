SUMMARY = "Reference last page for Page N of M type footers"
DESCRIPTION = "Reference the number of pages in your LaTeX document through \
the introduction of a new label which can be referenced like \
\\pageref{LastPage} to give a reference to the last page of a \
document. It is particularly useful in the page footer that \
says: Page N of M."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0asvn66461"

RPM_NAME = "texlive-lastpage-2023.201.2.0asvn66461-55.1.noarch.rpm"
RPM_HASH = "1231e646b741fbfc17ee7ff2deec776578bd9ced2b1069c9eca37c28d9a4c75f6907c565ede590c81b9609d28b92d8cbb11582ca276cae72106fb7d2a90a8aba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lastpage.sty \
tex-lastpage209.sty \
tex-lastpage2e.sty \
tex-lastpageclassic.sty \
tex-lastpagemodern.sty \
texlive-lastpage"

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
