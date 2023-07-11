SUMMARY = "Latvian hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Latvian in L7X and UTF-8 encodings."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn58652"

RPM_NAME = "texlive-hyphen-latvian-2023.208.svn58652-53.1.noarch.rpm"
RPM_HASH = "208e95b9a962f55ab743344a6502255f35d4941800c9d184cdbf0547ddbe83bb6ed6b88d8f2bf5f80c87eddcf256e7e001d25fd537032cef3f6acab2cec9105c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-lv.l7x.tex \
tex-hyph-lv.tex \
tex-loadhyph-lv.tex \
texlive-hyphen-latvian"

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
