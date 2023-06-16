SUMMARY = "Color support based on LuaTeX's node attributes"
DESCRIPTION = "This package implements color support based on LuaTeX's node \
attributes."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.17svn57829"

RPM_NAME = "texlive-luacolor-2023.201.1.17svn57829-52.1.noarch.rpm"
RPM_HASH = "fc49e7bb6b81cb9892d45b650a077a4558baba42134e2fbfe4e3b24d471746d53a8a2eff16a2eb0a200b890b319cdb65b1a56cd44e69bf967313992213b8c5d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-luacolor.sty \
texlive-luacolor"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-atbegshi.sty \
tex-color.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
