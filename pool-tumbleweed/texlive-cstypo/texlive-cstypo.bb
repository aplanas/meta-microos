SUMMARY = "Czech typography rules enforced through LuaTeX hooks"
DESCRIPTION = "This package provides macros that enforce basic Czech \
typography rules through Lua hooks available in LuaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.204.0.0.03svn41986"

RPM_NAME = "texlive-cstypo-2023.204.0.0.03svn41986-54.1.noarch.rpm"
RPM_HASH = "a777c9479a605401db0d7d169cc9e679627bfd500133dbe18514234a48a605cc96bfab5ef2453c71c354134e5ee727fd0e95549c9b6e0045425c99e83dfd7b58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(cstypo-tex.tex) \
tex(cstypo.sty) \
texlive-cstypo"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(ifluatex.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
