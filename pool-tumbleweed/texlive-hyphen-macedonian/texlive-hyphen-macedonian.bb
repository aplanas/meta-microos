SUMMARY = "Macedonian hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Macedonian"
LICENSE = "LPPL-1.0"

PV = "2023.208.svn58652"

RPM_NAME = "texlive-hyphen-macedonian-2023.208.svn58652-53.1.noarch.rpm"
RPM_HASH = "b3bc7b4bc8a54cafe20f568f927dafb795e223ce85927de1374749bac5bc719db2874d4032567fef9cd33810bd460c51d0bd388c74add2c7d0210f1d827c01af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-mk.macedonian.tex \
tex-hyph-mk.tex \
tex-loadhyph-mk.tex \
texlive-hyphen-macedonian"

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
