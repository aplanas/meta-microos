SUMMARY = "Tool for linguists and phoneticians to visualize tone value patterns"
DESCRIPTION = "This package provides a TikZ-based solution to typeset \
visualisations of tone values. Currently, unt's model is \
implemented. Support for more models is planned."
LICENSE = "Apache-1.0"

PV = "2023.209.1.0svn60058"

RPM_NAME = "texlive-tonevalue-2023.209.1.0svn60058-53.1.noarch.rpm"
RPM_HASH = "d2928b76798e8856f90141fce669b72a4a849711543563a27cacfb06d09089c58ebd4bf03c79fc8bd294a048f15072614d8c754b07fd40abd84d2573885ee8e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tonevalue.sty \
texlive-tonevalue"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-contour.sty \
tex-etoolbox.sty \
tex-listofitems.sty \
tex-tikz.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
