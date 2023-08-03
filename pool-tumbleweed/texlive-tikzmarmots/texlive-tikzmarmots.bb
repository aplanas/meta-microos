SUMMARY = "Drawing little marmots in TikZ"
DESCRIPTION = "This is a LaTeX package for marmots to be used in TikZ \
pictures. These little figures are constructed in such a way \
that they may even 'borrow' some garments and other attributes \
from the TikZducks."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn54080"

RPM_NAME = "texlive-tikzmarmots-2023.209.1.0svn54080-53.1.noarch.rpm"
RPM_HASH = "d80351081362f2537b5b54fc527b57b3f88879aee99f605236ec4f7a8f389306bd1e0bbb9d5f26f925bd3bf849fcf2dfd759939afda5a261a842b7bb54fc351d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikzlibrarymarmots.code.tex \
tex-tikzmarmots.sty \
texlive-tikzmarmots"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifluatex.sty \
tex-ifxetex.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
