SUMMARY = "Allow LuaTeX to load external Lua packages"
DESCRIPTION = "This package allows LuaTeX to load packages from the default \
package.path and package.cpath locations. This could be useful \
to load external Lua modules, including modules installed via \
LuaRocks. This package requires ifluatex."
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.2svn54779"

RPM_NAME = "texlive-luapackageloader-2023.208.0.0.2svn54779-53.1.noarch.rpm"
RPM_HASH = "4858619341016a5084849f36c0138291acfca9127684d278d7703293494f3a6ea4dd7562289b10c06c016156fbdac4c6b3d6ed2b749b99581033c799c3314558"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-luapackageloader.sty \
texlive-luapackageloader"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifluatex.sty \
texlive \
texlive-filesystem \
texlive-iftex \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
