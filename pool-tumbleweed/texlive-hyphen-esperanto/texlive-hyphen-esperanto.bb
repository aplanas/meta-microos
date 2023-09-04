SUMMARY = "Esperanto hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Esperanto ISO Latin 3 and UTF-8 \
encodings. Note that TeX distributions don't ship any suitable \
fonts in Latin 3 encoding, so unless you create your own font \
support or want to use MlTeX, using native Unicode engines is \
highly recommended."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn58652"

RPM_NAME = "texlive-hyphen-esperanto-2023.209.svn58652-54.1.noarch.rpm"
RPM_HASH = "b55056394c92c0d2fa57cb2a6932a14c29449ce7539a494a0fe59d4d18546820e857db6730857cbad36c2e1cb977ad2b18c9437928e4262d37aaea7c1d558798"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-eo.il3.tex \
tex-hyph-eo.tex \
tex-loadhyph-eo.tex \
texlive-hyphen-esperanto"

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
