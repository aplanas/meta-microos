SUMMARY = "Emoji support in (Lua)LaTeX"
DESCRIPTION = "This package allows users to typeset emojis in LaTeX documents. \
It requires the LuaHBTeX engine, which can be called by \
lualatex since TeX Live 2020, or lualatex-dev in TeX Live 2019."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2.2svn59961"

RPM_NAME = "texlive-emoji-2023.209.0.0.2.2svn59961-54.1.noarch.rpm"
RPM_HASH = "e6575f098687ce936b0559787b2ec4ec490898024525daf4606fa7d68a183dbcf54917cd6cafd0e2d78f5a12a101edb22dcc9a91b3cee826e3660334d062d17f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-emoji-table.def \
tex-emoji.sty \
texlive-emoji"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontspec.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
