SUMMARY = "Generate truth tables of boolean values in LuaLaTeX"
DESCRIPTION = "This package provides an easy way for generating truth tables \
of boolean values in LuaLaTeX. The time required for operations \
is no issue while compiling with LuaLaTeX. The package supports \
nesting of commands for multiple operations. It can be modified \
or extended by writing custom lua programs. There is no need to \
install lua on users system as TeX distributions (TeX Live or \
MikTeX) come bundled with LuaLaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.208.1.1svn64508"

RPM_NAME = "texlive-luatruthtable-2023.208.1.1svn64508-53.1.noarch.rpm"
RPM_HASH = "16135ddddea52c66f4047a08b2a12a09fcb9d7f6b0327d1d7ce073ed7a1c15e2652f7f8ae47d34f7618728ce528457d7d98df8b94b50106f5e6156a9b4b236ec"
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
