SUMMARY = "Emoji support in (Lua)LaTeX"
DESCRIPTION = "This package allows users to typeset emojis in LaTeX documents. \
It requires the LuaHBTeX engine, which can be called by \
lualatex since TeX Live 2020, or lualatex-dev in TeX Live 2019."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2.2svn59961"

RPM_NAME = "texlive-emoji-2023.209.0.0.2.2svn59961-54.2.noarch.rpm"
RPM_HASH = "33f2b670da5dd0c0b529a93ecce22f8378a7f014f83da2fec21e89ee03d319fa0e8f90ff6e5231c252d5ef3e1279949ae10c16f850a4a2b41d839a02ef40249b"
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
