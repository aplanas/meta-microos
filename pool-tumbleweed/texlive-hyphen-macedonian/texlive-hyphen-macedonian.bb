SUMMARY = "Macedonian hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Macedonian"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn58652"

RPM_NAME = "texlive-hyphen-macedonian-2023.209.svn58652-54.1.noarch.rpm"
RPM_HASH = "403dea1562ee1ca1a6d26dac345efa15ade0cdb595495b08053a31298cfbd7f72c7137b4f4c8a0fcd2c69365cf509bb04bf7c579504da278168ca81241b8a771"
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
