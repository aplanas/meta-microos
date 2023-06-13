SUMMARY = "Draw wheelcharts with TikZ"
DESCRIPTION = "This package is based on the package TikZ and can be used to \
draw wheelcharts with TikZ. It provides several options to \
customize the wheelcharts."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn64373"

RPM_NAME = "texlive-wheelchart-2023.201.1.0svn64373-53.1.noarch.rpm"
RPM_HASH = "e65b955abe3fbae56816b23bea4fe34d5696139858876bac7c4c036aa4c91a04bab4f119e30459b271b0160cb8431195e7586977ccf7af7ab874074119dc9531"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(wheelchart.sty) \
texlive-wheelchart"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(tikz.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
