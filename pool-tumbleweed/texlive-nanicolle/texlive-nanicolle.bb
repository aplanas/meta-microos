SUMMARY = "Typesetting herbarium specimen labels"
DESCRIPTION = "This package provides a LaTeX class nanicolle.cls for \
typesetting collection labels and identification labels in \
Chinese style or in western style for plant herbarium \
specimens. So far, documents using this class can only be \
compiled with XeLaTeX. Note: The name of the package is a \
compound of the Japanese 'nani' (meaning 'what') and a \
truncated form of the English 'collect', thus expressing the \
ideas of identification/classification (taxonomy) and \
collection."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.03ysvn56224"

RPM_NAME = "texlive-nanicolle-2023.201.2.03ysvn56224-54.1.noarch.rpm"
RPM_HASH = "7f5f3d37d4baf33051dcf66bc3a91f13780537e0fc32acb2c78aaa14b3a82518b59d26e0a38f5775193b395746769664f3826fcc1a6bd786c88780785e96ea31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(nanicolle.cls) \
texlive-nanicolle"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(calc.sty) \
tex(color.sty) \
tex(ctexart.cls) \
tex(geometry.sty) \
tex(graphicx.sty) \
tex(listofitems.sty) \
tex(makebarcode.sty) \
tex(multicol.sty) \
tex(qrcode.sty) \
tex(rulerbox.sty) \
tex(xstring.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
