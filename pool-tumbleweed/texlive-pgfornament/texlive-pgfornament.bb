SUMMARY = "Drawing of Vectorian ornaments with PGF/TikZ"
DESCRIPTION = "This package allows the drawing of Vectorian ornaments (196) \
with PGF/TikZ. The documentation presents the syntax and \
parameters of the macro 'pgfornament'."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn55326"

RPM_NAME = "texlive-pgfornament-2023.201.1.2svn55326-51.1.noarch.rpm"
RPM_HASH = "51ad118dd7dbfbdf09c12ff6275fb1d95f33f981017373939375808731ded3bbcecd681b99bc877535939efd7448edc3369845d147ad467522bc8d44b2a914f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pgflibraryam.code.tex) \
tex(pgflibrarypgfhan.code.tex) \
tex(pgflibraryvectorian.code.tex) \
tex(pgfornament.sty) \
tex(tikzrput.sty) \
texlive-pgfornament"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(iftex.sty) \
tex(pgfopts.sty) \
tex(tikz.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
