SUMMARY = "Esperanto hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Esperanto ISO Latin 3 and UTF-8 \
encodings. Note that TeX distributions don't ship any suitable \
fonts in Latin 3 encoding, so unless you create your own font \
support or want to use MlTeX, using native Unicode engines is \
highly recommended."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn58652"

RPM_NAME = "texlive-hyphen-esperanto-2023.208.svn58652-53.1.noarch.rpm"
RPM_HASH = "1f379121732ce0deca7c18485015fa2403bb4dddedac10bfc4a4e566ef7fafa13e34605fc5d825f7d61eedfea2261d150d010ecedb593b0c8a41aca91c131b37"
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
