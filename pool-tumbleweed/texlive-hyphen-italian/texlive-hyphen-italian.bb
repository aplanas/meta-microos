SUMMARY = "Italian hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Italian in ASCII encoding. Compliant \
with the Recommendation UNI 6461 on hyphenation issued by the \
Italian Standards Institution (Ente Nazionale di Unificazione \
UNI)."
LICENSE = "LGPL-2.1-or-later"

PV = "2023.201.4.8gsvn58652"

RPM_NAME = "texlive-hyphen-italian-2023.201.4.8gsvn58652-52.1.noarch.rpm"
RPM_HASH = "1755a9126a2f20d65cc1fb075f28c5fc1a52f3d346ac88d2a5d7d88af9be49765e0d243c02ad84558c921290aff8c4253424c10fbabe0277f19e6de12ffa55c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-it.tex \
tex-hyph-quote-it.tex \
tex-loadhyph-it.tex \
texlive-hyphen-italian"

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
