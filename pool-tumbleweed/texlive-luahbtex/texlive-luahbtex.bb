SUMMARY = "LuaTeX with HarfBuzz library for glyph shaping"
DESCRIPTION = "The luahbtex package"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn66186"

RPM_NAME = "texlive-luahbtex-2023.201.svn66186-52.1.noarch.rpm"
RPM_HASH = "93f5f7c2edc997e6a7a3b50fc582a47fb9a054809f8b868cc9fdd1cfaf942d39a4d1b91daa4e0fc48e57517ed37fd6b374e5922ca93cba3c4d0ea379a0fe9124"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-luahbtex.1 \
texlive-luahbtex"

RDEPENDS:${PN} += "/bin/sh \
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
texlive-luahbtex-bin \
texlive-luatex \
texlive-plain \
texlive-scripts \
texlive-scripts-bin \
texlive-tex-ini-files \
texlive-unicode-data"

inherit rpm
