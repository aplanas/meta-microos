SUMMARY = "Czech typography rules enforced through LuaTeX hooks"
DESCRIPTION = "This package provides macros that enforce basic Czech \
typography rules through Lua hooks available in LuaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.03svn41986"

RPM_NAME = "texlive-cstypo-2023.209.0.0.03svn41986-55.1.noarch.rpm"
RPM_HASH = "3e73515a8e2e1d09db3b7e4cc5aad109d8c73ca791c66ec395e27a0ada81494178f2a3a7a3c1803982714ce72ea1e7fe6fed5b8adc3a4467b094775f27bcbcec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cstypo-tex.tex \
tex-cstypo.sty \
texlive-cstypo"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifluatex.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
