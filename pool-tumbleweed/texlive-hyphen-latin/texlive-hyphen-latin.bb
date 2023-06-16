SUMMARY = "Latin hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Latin in T1/EC and UTF-8 encodings, \
mainly in modern spelling (u when u is needed and v when v is \
needed), medieval spelling with the ligatures \\ae and \\oe and \
the (uncial) lowercase 'v' written as a 'u' is also supported. \
Apparently there is no conflict between the patterns of modern \
Latin and those of medieval Latin. Hyphenation patterns for the \
Classical Latin in T1/EC and UTF-8 encodings. Classical Latin \
hyphenation patterns are different from those of 'plain' Latin, \
the latter being more adapted to modern Latin. Hyphenation \
patterns for the Liturgical Latin in T1/EC and UTF-8 encodings."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.1svn58652"

RPM_NAME = "texlive-hyphen-latin-2023.201.3.1svn58652-52.1.noarch.rpm"
RPM_HASH = "a6974c0a608c4d74e35f3fdd067a50a2ce5adcd1dcbef43799ca1dd7f541f677251046ba52b7ecf9a551d21bbc3ce94fa3a29c1f32d7d53395fcc9cf861ec50f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-la-x-classic.ec.tex \
tex-hyph-la-x-classic.tex \
tex-hyph-la-x-liturgic.ec.tex \
tex-hyph-la-x-liturgic.tex \
tex-hyph-la.ec.tex \
tex-hyph-la.tex \
tex-loadhyph-la-x-classic.tex \
tex-loadhyph-la-x-liturgic.tex \
tex-loadhyph-la.tex \
texlive-hyphen-latin"

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
