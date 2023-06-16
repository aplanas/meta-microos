SUMMARY = "Standard form 298"
DESCRIPTION = "A LaTeX package for generating a completed standard form 298 \
(Rev. 8-98) as prescribed by ANSI Std. Z39.18 for report \
documentation as part of a document delivered, for instance, on \
a U.S. government contract."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn41653"

RPM_NAME = "texlive-sf298-2023.201.1.3svn41653-53.1.noarch.rpm"
RPM_HASH = "39453770e34c7e8408625423dfe23c26f159b29ff28c1303c357e84d8c30e61772f2541dcc3612ec7a0823f96c92b3327b3df09a8f55745639c7082de8612e1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-sf298.sty \
texlive-sf298"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fancyhdr.sty \
tex-multicol.sty \
tex-totpages.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
