SUMMARY = "Tool for linguists and phoneticians to visualize tone value patterns"
DESCRIPTION = "This package provides a TikZ-based solution to typeset \
visualisations of tone values. Currently, unt's model is \
implemented. Support for more models is planned."
LICENSE = "Apache-1.0"

PV = "2023.201.1.0svn60058"

RPM_NAME = "texlive-tonevalue-2023.201.1.0svn60058-52.1.noarch.rpm"
RPM_HASH = "30ec0ccefc0572a8d3b30cbb42b4bcdec01f59200793bfa5062c2e64693a263d1c7f260d70071b0597405335ec64f4a535b56a7e47cd1a147279d4eb88f1dad3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(tonevalue.sty) \
texlive-tonevalue"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(contour.sty) \
tex(etoolbox.sty) \
tex(listofitems.sty) \
tex(tikz.sty) \
tex(xcolor.sty) \
tex(xkeyval.sty) \
tex(xstring.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
