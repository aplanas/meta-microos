SUMMARY = "Turkmen hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Turkmen in T1/EC and UTF-8 encodings."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn58652"

RPM_NAME = "texlive-hyphen-turkmen-2023.209.svn58652-54.1.noarch.rpm"
RPM_HASH = "84bf85f497b61c20fdebf6a4a361064751984b5fe8e9a3c689a3d618e78a2ce740fc7e05f746fa10b81566ccca1b3c8c05ca8bcbea56291af07e57411344d6ba"
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
