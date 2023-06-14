SUMMARY = "Draw arrows over math letters"
DESCRIPTION = "This package provides LaTeX math-mode commands for setting left \
and right arrows over mathematical symbols so that the arrows \
dynamically scale with the symbols. While it is possible to set \
arrows over longer strings of symbols, the focus lies on single \
characters."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn59993"

RPM_NAME = "texlive-letterswitharrows-2023.201.svn59993-54.1.noarch.rpm"
RPM_HASH = "f529fd57beb64bd15c1d8d26e1b088577e1219a7f0f2185818dc2f9571e9abd190b6ca84dc2d00fa4a850f074cfceb59dbd39e290d9c34bcf230f1189ab2fbff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-letterswitharrows.sty \
texlive-letterswitharrows"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-l3keys2e.sty \
tex-mathtools.sty \
tex-pgf.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
