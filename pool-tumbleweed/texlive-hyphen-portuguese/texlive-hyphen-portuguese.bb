SUMMARY = "Portuguese hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Portuguese in T1/EC and UTF-8 \
encodings."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn58609"

RPM_NAME = "texlive-hyphen-portuguese-2023.209.svn58609-54.1.noarch.rpm"
RPM_HASH = "106e56dd32aa117d8280268942c64cce37b67902aa882e202e193c873ffbe0ce7f9daecadd22c9041737211c399d8aca17fcbc1cffb77f0c05a4f2308a8c891f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-pt.ec.tex \
tex-hyph-pt.tex \
tex-loadhyph-pt.tex \
texlive-hyphen-portuguese"

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
