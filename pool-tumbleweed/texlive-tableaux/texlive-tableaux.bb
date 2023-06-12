SUMMARY = "Construct tables of signs and variations"
DESCRIPTION = "The package uses PSTricks; the user may define the width of the \
table, the number of lines and the height of each line. \
Placement of labels within the boxes may be absolute, or as a \
percentage of the width; various other controls are available."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn42413"

RPM_NAME = "texlive-tableaux-2023.201.svn42413-57.1.noarch.rpm"
RPM_HASH = "951d847dc8b6e85a1a20ba3f3eb943ecff442c54d0bea329dcf761f66bce5c77adc46e4f0761d2958e4ecdbf0734207983f4288420355216d16b284aa0c163ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(minimum.sty) \
tex(tableau.sty) \
texlive-tableaux"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(amsmath.sty) \
tex(amssymb.sty) \
tex(array.sty) \
tex(babel.sty) \
tex(fontenc.sty) \
tex(graphicx.sty) \
tex(hhline.sty) \
tex(inputenc.sty) \
tex(pst-fill.sty) \
tex(pst-plot.sty) \
tex(pst-tree.sty) \
tex(pstcol.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
