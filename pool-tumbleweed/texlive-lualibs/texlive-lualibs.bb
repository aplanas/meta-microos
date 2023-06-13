SUMMARY = "Additional Lua functions for LuaTeX macro programmers"
DESCRIPTION = "Lualibs is a collection of Lua modules useful for general \
programming. The bundle is based on lua modules shipped with \
ConTeXt, and made available in this bundle for use independent \
of ConTeXt."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.2.75svn64615"

RPM_NAME = "texlive-lualibs-2023.201.2.75svn64615-52.1.noarch.rpm"
RPM_HASH = "f19279257e62751e0722c84581ba3cc1ce9adf2101cd9f5230cfef931c91758d52df7c6fd58b67f7c33c218bbaa5ad1704c32bf9e8dc27d90bb38a58421d0a0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lualibs"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/texlua \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
