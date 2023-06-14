SUMMARY = "Croatian hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Croatian in T1/EC and UTF-8 encodings."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn58652"

RPM_NAME = "texlive-hyphen-croatian-2023.201.svn58652-52.1.noarch.rpm"
RPM_HASH = "f2d2517bc0b1d1e0f9103720a96707e62e090f0bded2bd08543d383ec3150accdf128e4c951c91179263f31c6449c3aa8753d43790d82d408c6025c7a07ceb5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-hr.ec.tex \
tex-hyph-hr.tex \
tex-loadhyph-hr.tex \
texlive-hyphen-croatian"

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
texlive-filesystem \
texlive-hyph-utf8 \
texlive-hyphen-base \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
