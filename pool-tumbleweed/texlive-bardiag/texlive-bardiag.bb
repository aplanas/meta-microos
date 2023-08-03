SUMMARY = "LaTeX package for drawing bar diagrams"
DESCRIPTION = "The main purpose of the package is to make the drawing of bar \
diagrams possible and easy in LaTeX. The BarDiag package is \
inspired by and based on PSTricks."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4asvn22013"

RPM_NAME = "texlive-bardiag-2023.209.0.0.4asvn22013-54.1.noarch.rpm"
RPM_HASH = "aaec320f0f06354b5541932da0c44775ce6a71c3fc2946a7d9448c062968a1462867b92ae57d559c3391a630c0d0390598a761f4782989fd00330fb73927dfbb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-barddoc.sty \
tex-bardiag.cfg \
tex-bardiag.sty \
tex-pstfp.sty \
texlive-bardiag"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-fp-snap.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-ifthen.sty \
tex-listings.sty \
tex-makeidx.sty \
tex-multido.sty \
tex-pst-grad.sty \
tex-pstcol.sty \
tex-pstricks.sty \
tex-subfigure.sty \
tex-verbatim.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
