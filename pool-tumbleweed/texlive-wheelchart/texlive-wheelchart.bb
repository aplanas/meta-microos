SUMMARY = "Draw wheelcharts with TikZ"
DESCRIPTION = "This package is based on the package TikZ and can be used to \
draw wheelcharts with TikZ. It provides several options to \
customize the wheelcharts."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn64373"

RPM_NAME = "texlive-wheelchart-2023.209.1.0svn64373-54.1.noarch.rpm"
RPM_HASH = "8450335d5bb69eaee7f0fbf129644698fc3c6ac3046f0302df705f6e70932a9f1442fb6e5a5ee0b2998d18a4ae3d9e27ea09cb02262ea817304b29e7a66aacec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-wheelchart.sty \
texlive-wheelchart"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
