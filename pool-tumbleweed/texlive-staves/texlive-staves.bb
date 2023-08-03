SUMMARY = "Typeset Icelandic staves and runic letters"
DESCRIPTION = "This package contains all the necessary tools to typeset the \
'magical' Icelandic staves plus the runic letters used in \
Iceland. Included are a font in Adobe Type 1 format and LaTeX \
support."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-staves-2023.209.svn15878-58.1.noarch.rpm"
RPM_HASH = "21a743041ac4416483e712695f335859719c8b7691746c5951931a33f8bbbd2e880a60c6dc5b771fc38b2262ee035cf089dcb33ce22d1725e1416a8b00b83dae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-icelandic.map \
tex-icelandic.tfm \
tex-staves.sty \
texlive-staves"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-staves-fonts"

inherit rpm
