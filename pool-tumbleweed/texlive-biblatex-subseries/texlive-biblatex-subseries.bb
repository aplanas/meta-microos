SUMMARY = "Manages subseries with BibLaTeX"
DESCRIPTION = "Some publishers organize book series with subseries. In this \
case, two numbers are associated with one volume: the number \
inside the series and the number inside the subseries. That is \
the case of the series Corpus Scriptorium Christianorum \
Orientalium published by Peeters. This package provides new \
fields to manage such system."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2.0svn43330"

RPM_NAME = "texlive-biblatex-subseries-2023.201.1.2.0svn43330-53.1.noarch.rpm"
RPM_HASH = "2494b78a62d1b75f338c8198a45a7874f0dcfdd1e751ccd7996fbd2c9ffe1f40d5fd2ef36505bdd4cf38ae3b7bd621b2687ceddbef77a7cceb285e64601f65c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(subseries.bbx) \
texlive-biblatex-subseries"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(xpatch.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
