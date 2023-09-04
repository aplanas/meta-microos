SUMMARY = "Hungarian hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Hungarian in T1/EC and UTF-8 \
encodings."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn58652"

RPM_NAME = "texlive-hyphen-hungarian-2023.209.svn58652-54.1.noarch.rpm"
RPM_HASH = "34174c02bbbee711461b1e50895f9fb9236b91e7b1f63625772b06f72c1d9d15d99f4c8de5e554848baed91d30bbeef48b4cb58732a8cd5090d2b3f486542458"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-hu.ec.tex \
tex-hyph-hu.tex \
tex-loadhyph-hu.tex \
texlive-hyphen-hungarian"

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
