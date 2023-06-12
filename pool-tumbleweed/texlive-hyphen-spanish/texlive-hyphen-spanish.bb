SUMMARY = "Spanish hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Spanish in T1/EC and UTF-8 encodings."
LICENSE = "LPPL-1.0"

PV = "2023.201.5.0svn58652"

RPM_NAME = "texlive-hyphen-spanish-2023.201.5.0svn58652-52.1.noarch.rpm"
RPM_HASH = "63f9c2fc5c4747238e578ed32b2bc21f8c81c85bfc6b93134b8067ea4cc107692d39ae89da4e861ba43d5286011472fc12c8a1c1a2d444aa720eed89b5799a84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(hyph-es.ec.tex) \
tex(hyph-es.tex) \
tex(loadhyph-es.tex) \
texlive-hyphen-spanish"
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
texlive-filesystem \
texlive-hyph-utf8 \
texlive-hyphen-base \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
