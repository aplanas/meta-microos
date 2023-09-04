SUMMARY = "Galician hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Galician in T1/EC and UTF-8 encodings."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn58652"

RPM_NAME = "texlive-hyphen-galician-2023.209.svn58652-54.1.noarch.rpm"
RPM_HASH = "aa313b4180dd21d296d533d755b74a550d9a5a400f530d7d7018b6c715ed45341d4ebd28506323c8d9dcc9f5f2c5558bd930a84e4794468df0f03777ad23dd52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-gl.ec.tex \
tex-hyph-gl.tex \
tex-loadhyph-gl.tex \
texlive-hyphen-galician"

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
texlive-filesystem \
texlive-hyph-utf8 \
texlive-hyphen-base \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
