SUMMARY = "LuaTeX with just-in-time (jit) compiler, with and without HarfBuzz"
DESCRIPTION = "The luajittex package"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn66186"

RPM_NAME = "texlive-luajittex-2023.201.svn66186-52.1.noarch.rpm"
RPM_HASH = "381fe229de834353f83e3c925cbf445e2be7ffb8b2958c8d57131075c79cbdb788427f1a7cf239a90561bcf0a1d600d198c9a51ba2aa2cab0d68f933e4f960af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man(luajithbtex.1) \
man(luajittex.1) \
texlive-luajittex"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(language.dat) \
tex(language.dat.lua) \
tex(language.def) \
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
