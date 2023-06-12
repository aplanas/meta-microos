SUMMARY = "Drawing little marmots in TikZ"
DESCRIPTION = "This is a LaTeX package for marmots to be used in TikZ \
pictures. These little figures are constructed in such a way \
that they may even 'borrow' some garments and other attributes \
from the TikZducks."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn54080"

RPM_NAME = "texlive-tikzmarmots-2023.201.1.0svn54080-52.1.noarch.rpm"
RPM_HASH = "d0d3c79851d33cb08d3e22a518e160e4f2474a6006a5f1be1382531ae5bd94441cdc4423302ab060c4514a60d2dab322ab4a4138c926684bd9231638444a4e9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(tikzlibrarymarmots.code.tex) \
tex(tikzmarmots.sty) \
texlive-tikzmarmots"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(ifluatex.sty) \
tex(ifxetex.sty) \
tex(tikz.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
