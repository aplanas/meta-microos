SUMMARY = "Techniques for reflecting graphics"
DESCRIPTION = "The package provides a macro for reflecting images, in a number \
of different ways, in pursuit of 'more striking' graphics in a \
document."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2csvn40612"

RPM_NAME = "texlive-reflectgraphics-2023.209.0.0.2csvn40612-54.1.noarch.rpm"
RPM_HASH = "e678a73ff942d86a85f69193b1487b28372f3ce9b0415d4c9cf5b30815646769e7656aac567b2b947c9d1d74d3cf5af407f634aec1b05b7f8938750e0a018f04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-reflectgraphics.sty \
texlive-reflectgraphics"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-color.cfg \
tex-graphicx.sty \
tex-keyval.sty \
tex-kvoptions.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
