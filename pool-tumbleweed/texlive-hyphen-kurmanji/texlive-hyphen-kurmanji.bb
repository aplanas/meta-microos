SUMMARY = "Kurmanji hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Kurmanji (Northern Kurdish) as spoken \
in Turkey and by the Kurdish diaspora in Europe, in T1/EC and \
UTF-8 encodings."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn58652"

RPM_NAME = "texlive-hyphen-kurmanji-2023.208.svn58652-53.1.noarch.rpm"
RPM_HASH = "529d3ed62fdde26244843db991262e91397cc72bbaacab3c28ba8e03d174b245c5a54a17ebed15071d7521ab37f4fd430e6cfdbede00fc3f917a272041991a27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-kmr.ec.tex \
tex-hyph-kmr.tex \
tex-loadhyph-kmr.tex \
texlive-hyphen-kurmanji"

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
