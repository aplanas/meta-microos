SUMMARY = "Penlight Lua libraries made available to LuaLaTeX users"
DESCRIPTION = "This LuaLaTeX package provides a wrapper to use the penlight \
Lua libraries with LuaLaTeX, with some extra functionality \
added."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn64811"

RPM_NAME = "texlive-penlight-2023.201.svn64811-51.1.noarch.rpm"
RPM_HASH = "da362ad093690f2180f2e70d8e0471ac58f86f38fc7e8d81fedb523006c6fce59bfa0d4452cae1fe93beb8e826618f10496ae00f32adbe567b783704491734ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(penlight.sty) \
texlive-penlight"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(luacode.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
