SUMMARY = "Draw graphs typically found in molecular biology texts"
DESCRIPTION = "The package draws graphs typically found in molecular biology \
texts. Currently, the package contains modules for drawing DNA \
sequencing chromatograms and protein domain diagrams."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.21svn35152"

RPM_NAME = "texlive-pgfmolbio-2023.209.0.0.21svn35152-52.1.noarch.rpm"
RPM_HASH = "8d697c61e0711201d8998b090606ec25090e5e3b5cfab7b1d1580806e83c93a42ab038af5fdef3658bde9cc56d51a6372f12931e42b2f8fe05467a2bde494bcf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pgfmolbio.chromatogram.tex \
tex-pgfmolbio.convert.tex \
tex-pgfmolbio.domains.tex \
tex-pgfmolbio.sty \
texlive-pgfmolbio"

RDEPENDS:${PN} += "/usr/bin/luatex \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifluatex.sty \
tex-luatexbase-modutils.sty \
tex-tikz.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
