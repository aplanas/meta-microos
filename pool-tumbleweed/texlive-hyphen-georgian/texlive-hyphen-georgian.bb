SUMMARY = "Georgian hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Georgian in T8M, T8K and UTF-8 \
encodings."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn58652"

RPM_NAME = "texlive-hyphen-georgian-2023.208.svn58652-53.1.noarch.rpm"
RPM_HASH = "b72605b3aaa9ec810e5af3394eadf2c2eb77d4b3cd2b40a38a575a8c8e610496aba992e9b21c678f4c1305bcae6cfaa9eb3aa58bb591fdbce89a4c7e1e03ae83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-ka.t8m.tex \
tex-hyph-ka.tex \
tex-loadhyph-ka.tex \
texlive-hyphen-georgian"

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
