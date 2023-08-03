SUMMARY = "Helps to draw codeblocks like scratch, NEPO and PXT in TikZ"
DESCRIPTION = "tikzcodeblocks is a LaTeX package for typesetting blockwise \
graphic programming languages like scratch, nepo or pxt."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.13svn54758"

RPM_NAME = "texlive-tikzcodeblocks-2023.209.0.0.13svn54758-53.1.noarch.rpm"
RPM_HASH = "656b44eccf802c523c95a1f6a5035de79d756101a07c2e724107c7fc5ee787cac03e532ba61f508cc332645bd1d4d8ac115023582d75e729a1de2a2f0f06726b"
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
