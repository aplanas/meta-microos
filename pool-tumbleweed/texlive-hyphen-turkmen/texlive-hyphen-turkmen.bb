SUMMARY = "Turkmen hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Turkmen in T1/EC and UTF-8 encodings."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn58652"

RPM_NAME = "texlive-hyphen-turkmen-2023.208.svn58652-53.1.noarch.rpm"
RPM_HASH = "c602aa2dc34d7286571877a5d7844c85b704fa4d52664c332ff7044f12f518e0844df40132bf252c00d7631bdefc7a994332fd3ebf31c0c6972723899c3f00ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-tk.ec.tex \
tex-hyph-tk.tex \
tex-loadhyph-tk.tex \
texlive-hyphen-turkmen"

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
