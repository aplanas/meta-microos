SUMMARY = "Articles with teasers and continuation later on"
DESCRIPTION = "Jumplines is a package for typesetting (newspaper) articles \
that show a teaser (some few lines of text/content) and are \
continued at a later place, with optional hyperlinking and a \
list of articles. It requires lualatex for colour support in \
split boxes."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn37553"

RPM_NAME = "texlive-jumplines-2023.209.0.0.2svn37553-56.1.noarch.rpm"
RPM_HASH = "b23af1e779409c713ff00dfc8b617b0d5ee79c2a0af0fffe63c26888a7ff25402ca20d1b1840932665ac0969cc0a7cb1f64a2d04fa80f696a6250fee2170c229"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-jumplines.sty \
texlive-jumplines"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-babel.sty \
tex-bookmark.sty \
tex-etoolbox.sty \
tex-hyperref.sty \
tex-ifluatex.sty \
tex-luacolor.sty \
tex-tcolorbox.sty \
tex-tocloft.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
