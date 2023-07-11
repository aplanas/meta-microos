SUMMARY = "Bulgarian hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Bulgarian in T2A and UTF-8 encodings."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn58685"

RPM_NAME = "texlive-hyphen-bulgarian-2023.208.svn58685-53.1.noarch.rpm"
RPM_HASH = "537c3ae8513600afc991bf9a16cfb7f5b576f4ca5db3fc968b2de2c7bb5528ac46e8b95ebc1f19f1d77a1fb6b1ec1cf522822c5dee7619f4ff289ee0c6eb0efe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-bg.t2a.tex \
tex-hyph-bg.tex \
tex-loadhyph-bg.tex \
texlive-hyphen-bulgarian"

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
