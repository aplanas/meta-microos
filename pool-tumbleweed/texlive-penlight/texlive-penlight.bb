SUMMARY = "Penlight Lua libraries made available to LuaLaTeX users"
DESCRIPTION = "This LuaLaTeX package provides a wrapper to use the penlight \
Lua libraries with LuaLaTeX, with some extra functionality \
added."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn64811"

RPM_NAME = "texlive-penlight-2023.209.svn64811-52.1.noarch.rpm"
RPM_HASH = "682c40234afa4dcc9d1916b7e83e621b1c5c975b611c63d7205b518c64847ce6855c3115635625b3ca4e01ec7eab7546850d3ee878cf7304da8b32c7e914c37a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-penlight.sty \
texlive-penlight"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-luacode.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
