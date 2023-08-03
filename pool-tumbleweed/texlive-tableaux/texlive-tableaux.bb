SUMMARY = "Construct tables of signs and variations"
DESCRIPTION = "The package uses PSTricks; the user may define the width of the \
table, the number of lines and the height of each line. \
Placement of labels within the boxes may be absolute, or as a \
percentage of the width; various other controls are available."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn42413"

RPM_NAME = "texlive-tableaux-2023.209.svn42413-58.1.noarch.rpm"
RPM_HASH = "88aba5017be174dfd56ba47346f686eb139e37714d810f68f71f124f1014d456542895a8b8a9d819adfe7adc00148163787e5478363ee869c0d3bc0206d00d2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-minimum.sty \
tex-tableau.sty \
texlive-tableaux"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-array.sty \
tex-babel.sty \
tex-fontenc.sty \
tex-graphicx.sty \
tex-hhline.sty \
tex-inputenc.sty \
tex-pst-fill.sty \
tex-pst-plot.sty \
tex-pst-tree.sty \
tex-pstcol.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
