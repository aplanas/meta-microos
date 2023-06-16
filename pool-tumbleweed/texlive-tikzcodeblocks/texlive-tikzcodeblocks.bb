SUMMARY = "Helps to draw codeblocks like scratch, NEPO and PXT in TikZ"
DESCRIPTION = "tikzcodeblocks is a LaTeX package for typesetting blockwise \
graphic programming languages like scratch, nepo or pxt."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.13svn54758"

RPM_NAME = "texlive-tikzcodeblocks-2023.201.0.0.13svn54758-52.1.noarch.rpm"
RPM_HASH = "622f3a36baceda4bc74fa4827504d46ab2f0260193757563d1a7e7ad435dd73317e084e9e3e2c6513dfca805a0da4b2aea735788364f9d10fc2d39eafb888cad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikzcodeblocks.sty \
texlive-tikzcodeblocks"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-adjustbox.sty \
tex-colortbl.sty \
tex-fontawesome.sty \
tex-ifthen.sty \
tex-longtable.sty \
tex-tikz.sty \
tex-translations.sty \
tex-xcolor.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
