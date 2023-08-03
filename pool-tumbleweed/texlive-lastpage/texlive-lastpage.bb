SUMMARY = "Reference last page for Page N of M type footers"
DESCRIPTION = "Reference the number of pages in your LaTeX document through \
the introduction of a new label which can be referenced like \
\\pageref{LastPage} to give a reference to the last page of a \
document. It is particularly useful in the page footer that \
says: Page N of M."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0asvn66461"

RPM_NAME = "texlive-lastpage-2023.209.2.0asvn66461-56.1.noarch.rpm"
RPM_HASH = "094bf997195a3ff4895330b42f6787745931fb36b134c2c26c303b6fe441cf31e0ea01e4498c5361063f97c6300d168f0000555d62a3e115b250f58e8f48523a"
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
