SUMMARY = "Generate truth tables of boolean values in LuaLaTeX"
DESCRIPTION = "This package provides an easy way for generating truth tables \
of boolean values in LuaLaTeX. The time required for operations \
is no issue while compiling with LuaLaTeX. The package supports \
nesting of commands for multiple operations. It can be modified \
or extended by writing custom lua programs. There is no need to \
install lua on users system as TeX distributions (TeX Live or \
MikTeX) come bundled with LuaLaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn64508"

RPM_NAME = "texlive-luatruthtable-2023.201.1.1svn64508-52.1.noarch.rpm"
RPM_HASH = "f122581534c6fdc6fe5d23b22bbefe3fb82b08ed6f3dd5451fa5560a5b21760b3ad627bc036699291a52fdc9a8a3a9cdc0d0efe0351966a149d8f4ee8659444f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-luatruthtable.sty \
texlive-luatruthtable"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-luacode.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
