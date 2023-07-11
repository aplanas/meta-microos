SUMMARY = "Italian hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Italian in ASCII encoding. Compliant \
with the Recommendation UNI 6461 on hyphenation issued by the \
Italian Standards Institution (Ente Nazionale di Unificazione \
UNI)."
LICENSE = "LGPL-2.1-or-later"

PV = "2023.208.4.8gsvn58652"

RPM_NAME = "texlive-hyphen-italian-2023.208.4.8gsvn58652-53.1.noarch.rpm"
RPM_HASH = "a9098d20efd26f3e218a5f2fa25438a838059048276aa9315144567d46a871ec7402874a58fba5547e4c995454e7c57ca65507f307abef0dff1cd46598a802d5"
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
