SUMMARY = "Emoji support in (Lua)LaTeX"
DESCRIPTION = "This package allows users to typeset emojis in LaTeX documents. \
It requires the LuaHBTeX engine, which can be called by \
lualatex since TeX Live 2020, or lualatex-dev in TeX Live 2019."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2.2svn59961"

RPM_NAME = "texlive-emoji-2023.201.0.0.2.2svn59961-53.2.noarch.rpm"
RPM_HASH = "83eb1c91a5346f98f40eaa5d24f8ea543970a47f65e8b51551b207965b9c262032f0789b9ea34d03a45a56724f669787e410e83b31e3cadfd8c420f170631100"
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
