SUMMARY = "Articles with teasers and continuation later on"
DESCRIPTION = "Jumplines is a package for typesetting (newspaper) articles \
that show a teaser (some few lines of text/content) and are \
continued at a later place, with optional hyperlinking and a \
list of articles. It requires lualatex for colour support in \
split boxes."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn37553"

RPM_NAME = "texlive-jumplines-2023.201.0.0.2svn37553-55.1.noarch.rpm"
RPM_HASH = "04d62995caf5b2d71c6039ea47f4b28abcfa6812ff70aa969fcb5ddf495e873cf71b2cb0d7fc103fdd54c6946ba3870b43fecd93ebeca8e997372d4d227a8b8d"
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
