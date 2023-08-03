SUMMARY = "Snowman variants using TikZ"
DESCRIPTION = "This LaTeX package provides a command \\scsnowman which can \
display many variants of 'snowman' ('yukidaruma' in Japanese). \
TikZ is required for drawing these snowmen."
LICENSE = "BSD-3-Clause"

PV = "2023.209.1.3csvn66115"

RPM_NAME = "texlive-scsnowman-2023.209.1.3csvn66115-54.1.noarch.rpm"
RPM_HASH = "4f090119ead20299a6677276c86bb12b4a340581b17e57d31b0bb5363624f3077c01e645282f323e33962751120bd985278fd880720773f666bc32d281b4c769"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-scsnowman-normal.def \
tex-scsnowman.sty \
tex-sctkzsym-base.sty \
texlive-scsnowman"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-keyval.sty \
tex-pxeveryshi.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
