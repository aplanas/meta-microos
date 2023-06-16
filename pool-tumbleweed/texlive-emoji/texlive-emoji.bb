SUMMARY = "Emoji support in (Lua)LaTeX"
DESCRIPTION = "This package allows users to typeset emojis in LaTeX documents. \
It requires the LuaHBTeX engine, which can be called by \
lualatex since TeX Live 2020, or lualatex-dev in TeX Live 2019."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2.2svn59961"

RPM_NAME = "texlive-emoji-2023.201.0.0.2.2svn59961-53.1.noarch.rpm"
RPM_HASH = "f939cff1038d42fcc81a725723b2e89336bf2a7f4b8ee973bf4b5f7947d6786cb773ea90e8c6fc8c433c6ee7465631887b85dd2fe5bdf1a574c7a400adfc8ba4"
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
