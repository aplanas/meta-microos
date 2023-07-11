SUMMARY = "Programmable table interface for LuaLaTeX"
DESCRIPTION = "This package allows you to modify a cell based on the contents \
of other cells using LaTeX macros."
LICENSE = "LPPL-1.0"

PV = "2023.208.1.0svn56113"

RPM_NAME = "texlive-luaprogtable-2023.208.1.0svn56113-53.1.noarch.rpm"
RPM_HASH = "0ac19d652f2de55b2da257bb7071450c69e4fa1d7ad1ee3d09753fd041f280b9650e765a7327d8a2bbe299b61088340243085c1fa41b89f1cd256280a384089c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-luaprogtable.sty \
texlive-luaprogtable"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-iftex.sty \
tex-luatexbase.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
