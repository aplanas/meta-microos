SUMMARY = "Typeset theses for University of Florence (Italy)"
DESCRIPTION = "The package provides a class to typeset Ph.D., Master, and \
Bachelor theses that adhere to the publishing guidelines of the \
University of Florence (Italy)."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.6svn60698"

RPM_NAME = "texlive-unifith-2023.201.1.6svn60698-53.1.noarch.rpm"
RPM_HASH = "d61a09d83f03ebea7cc3c227ce24b7aa5d305ee0d5a988f6fe46abedb62e63d2716ce6d5b14aed6b54124e2935d391db9b456fbaf4adbcb4583df7c4711de5c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(unifith.cls) \
texlive-unifith"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(amsmath.sty) \
tex(book.cls) \
tex(booktabs.sty) \
tex(caption.sty) \
tex(color.sty) \
tex(etoolbox.sty) \
tex(fancyhdr.sty) \
tex(fontenc.sty) \
tex(fontspec.sty) \
tex(geometry.sty) \
tex(graphicx.sty) \
tex(hyperref.sty) \
tex(ifxetex.sty) \
tex(lmodern.sty) \
tex(textcomp.sty) \
tex(xkeyval.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
