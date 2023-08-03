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

PV = "2023.209.2.03ysvn56224"

RPM_NAME = "texlive-nanicolle-2023.209.2.03ysvn56224-55.1.noarch.rpm"
RPM_HASH = "1c6219d4029e7fbac0d5a49b5dc1a565bbb32d076bb7c99e1c6f0145349afaccb3e7660845888c9a5814f665d31f278af2cddfc0a13360462228ae0b1b9848f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-nanicolle.cls \
texlive-nanicolle"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-color.sty \
tex-ctexart.cls \
tex-geometry.sty \
tex-graphicx.sty \
tex-listofitems.sty \
tex-makebarcode.sty \
tex-multicol.sty \
tex-qrcode.sty \
tex-rulerbox.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
