SUMMARY = "LuaTeX with HarfBuzz library for glyph shaping"
DESCRIPTION = "The luahbtex package"
LICENSE = "LPPL-1.0"

PV = "2023.208.svn66186"

RPM_NAME = "texlive-luahbtex-2023.208.svn66186-53.1.noarch.rpm"
RPM_HASH = "efaa7f592161d6c636e31c2eee72c2efb35721565bab6e537fb2c9b92381fe39ca8d872e3f94e437297ffc142d9ce0aea3776f7148eee3baee4a8631116c02d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-luahbtex.1 \
texlive-luahbtex"

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
texlive-luahbtex-bin \
texlive-luatex \
texlive-plain \
texlive-scripts \
texlive-scripts-bin \
texlive-tex-ini-files \
texlive-unicode-data"

inherit rpm
