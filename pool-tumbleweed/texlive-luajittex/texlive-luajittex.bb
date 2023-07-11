SUMMARY = "LuaTeX with just-in-time (jit) compiler, with and without HarfBuzz"
DESCRIPTION = "The luajittex package"
LICENSE = "LPPL-1.0"

PV = "2023.208.svn66186"

RPM_NAME = "texlive-luajittex-2023.208.svn66186-53.1.noarch.rpm"
RPM_HASH = "c653beb60240cdba7e57a9b50c83b9dc33e19c82eadcebaa3349fae59438bbe19535685504aecec11379d799278a2795f81d4a0df806878622f3badef3893fdf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-luajithbtex.1 \
man-luajittex.1 \
texlive-luajittex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-language.dat \
tex-language.dat.lua \
tex-language.def \
texlive \
texlive-cm \
texlive-etex \
texlive-filesystem \
texlive-hyph-utf8 \
texlive-hyphen-base \
texlive-knuth-lib \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-luajittex-bin \
texlive-luatex \
texlive-plain \
texlive-scripts \
texlive-scripts-bin \
texlive-tex-ini-files \
texlive-unicode-data"

inherit rpm
