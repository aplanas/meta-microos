SUMMARY = "Create index using LuaLaTeX"
DESCRIPTION = "Luaindex provides (yet another) index processor, written in \
Lua."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1bsvn25882"

RPM_NAME = "texlive-luaindex-2023.201.0.0.1bsvn25882-52.1.noarch.rpm"
RPM_HASH = "9f5b7688b15e379f55c8f07eab51deb750c3b69da9824c95071e2ef5de7f83634bbaf43b5ad796023f433228553480c9fd83abc08ee19bc0b9190c079b879d78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-luaindex.sty \
texlive-luaindex"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/luatex \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifluatex.sty \
tex-luatexbase-compat.sty \
tex-luatexbase-modutils.sty \
tex-scrbase.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
