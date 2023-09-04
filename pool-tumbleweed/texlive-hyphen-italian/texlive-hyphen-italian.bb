SUMMARY = "Italian hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Italian in ASCII encoding. Compliant \
with the Recommendation UNI 6461 on hyphenation issued by the \
Italian Standards Institution (Ente Nazionale di Unificazione \
UNI)."
LICENSE = "LGPL-2.1-or-later"

PV = "2023.209.4.8gsvn58652"

RPM_NAME = "texlive-hyphen-italian-2023.209.4.8gsvn58652-54.1.noarch.rpm"
RPM_HASH = "fee279a6c1bab0db8ecb6739aa42bd77df65ce756b645932fc11599b8faea57aae495b0935cfe1e34c6cf8ad4a273848b6ffec15f7318c6f76a6c2e995bfc152"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-it.tex \
tex-hyph-quote-it.tex \
tex-loadhyph-it.tex \
texlive-hyphen-italian"

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
